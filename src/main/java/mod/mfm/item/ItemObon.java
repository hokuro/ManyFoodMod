package mod.mfm.item;

import java.util.List;
import java.util.function.Predicate;

import mod.mfm.entity.EntityObon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemObon extends Item{

	private static final Predicate<Entity> field_219989_a = EntityPredicates.NOT_SPECTATING.and(Entity::canBeCollidedWith);
	public ItemObon(Item.Properties property) {
		super(property);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand){
		ItemStack itemstack = player.getHeldItem(hand);
		RayTraceResult raytraceresult = rayTrace(world, player, RayTraceContext.FluidMode.ANY);
		if (raytraceresult.getType() != RayTraceResult.Type.MISS) {
			 Vec3d vec3d = player.getLook(1.0F);
			 // ほかのエンティティとぶつかるようならスポーンさせない
			 List<Entity> list = world.getEntitiesInAABBexcluding(player, player.getBoundingBox().expand(vec3d.scale(5.0D)).grow(1.0D), field_219989_a);
			 if (!list.isEmpty()) {
				 Vec3d vec3d1 = player.getEyePosition(1.0F);
				 for(Entity entity : list) {
					 AxisAlignedBB axisalignedbb = entity.getBoundingBox().grow((double)entity.getCollisionBorderSize());
					 if (axisalignedbb.contains(vec3d1)) {
						 return new ActionResult<>(ActionResultType.PASS, itemstack);
					 }
				 }
			 }
			 if (raytraceresult.getType() == RayTraceResult.Type.BLOCK) {
				// アイスを置く
				BlockPos blockpos = new BlockPos(raytraceresult.getHitVec().x,raytraceresult.getHitVec().y,raytraceresult.getHitVec().z);
				if (world.isAirBlock(blockpos.add(0,1,0))){
					if (!world.isRemote){
						try{
							EntityObon obon = new EntityObon(world, blockpos);
							obon.rotationYaw = (MathHelper.floor((double)((player.rotationYaw*4F)/360F)+2.5D)&3)*90;
							world.addEntity(obon);
						}catch(Exception e){
						}
					}
					if(!player.isCreative()){
						itemstack.shrink(1);
					}
				}
				return new ActionResult<ItemStack>(ActionResultType.SUCCESS,itemstack);
			 }
		}
		return new ActionResult<ItemStack>(ActionResultType.PASS,itemstack);
	}
}
