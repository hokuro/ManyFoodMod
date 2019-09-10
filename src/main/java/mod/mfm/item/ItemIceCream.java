package mod.mfm.item;


import java.util.List;
import java.util.function.Predicate;

import mod.mfm.config.ConfigValue;
import mod.mfm.entity.EntityIceCream;
import mod.mfm.item.ItemCore.EnumIceFlavor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemIceCream extends ItemResetFood {
	private static final Predicate<Entity> field_219989_a = EntityPredicates.NOT_SPECTATING.and(Entity::canBeCollidedWith);
	private final EnumIceFlavor flavor;
	private final boolean inCookie;

	public ItemIceCream(EnumIceFlavor flavorIn, Item.Properties property) {
		this (flavorIn,false, property);
	}

	public ItemIceCream(EnumIceFlavor flavorIn, boolean cookie , Item.Properties property) {
		super(property);
		this.flavor = flavorIn;
		this.inCookie = cookie;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		ItemStack itemstack = player.getHeldItem(hand);
		RayTraceResult raytraceresult = rayTrace(world, player, RayTraceContext.FluidMode.ANY);
		if (raytraceresult.getType() == RayTraceResult.Type.MISS) {
			// ブロックに置けなければ食べる
			// 置くブロックがないのでそのまま食べる
	        if (player.canEat(ConfigValue.icecream.CanEatAllways()))
	        {
	            player.setActiveHand(hand);
	            return new ActionResult<ItemStack>(ActionResultType.SUCCESS, itemstack);
	        }
	        else
	        {
	            return new ActionResult<ItemStack>(ActionResultType.FAIL, itemstack);
	        }
		}else {
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
							EntityIceCream ice = new EntityIceCream(world, blockpos.add(0, 1, 0), flavor, this.inCookie);
							ice.rotationYaw = (MathHelper.floor((double)((player.rotationYaw*4F)/360F)+2.5D)&3)*90;
							world.addEntity(ice);
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

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		if (entityLiving instanceof PlayerEntity){
			onEat(stack,worldIn,(PlayerEntity)entityLiving);
			if (!worldIn.isRemote){
	            if (!((PlayerEntity)entityLiving).inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE,1))){
	            	((PlayerEntity)entityLiving).dropItem(new ItemStack(Items.GLASS_BOTTLE), false);
	            }
			}
		}
		stack.shrink(1);
        return stack;
    }

	public static void onEat(ItemStack stack, World worldIn, PlayerEntity entityplayer){
		if (stack.getItem() instanceof ItemIceCream){
			EnumIceFlavor flavor = ((ItemIceCream)stack.getItem()).getFlavor();
			ItemIceCream eat = ((ItemIceCream)stack.getItem());
			entityplayer.getFoodStats().addStats(eat.getHealAmount(stack) + (eat.inCookie?1:0), eat.getSaturationModifier(stack));
            worldIn.playSound((PlayerEntity)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);

            // 鎮火
            entityplayer.extinguish();
            // ポーション効果解除
            entityplayer.clearActivePotions();
            // 火炎耐性1分
            entityplayer.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE,1200,1));

    		for (EffectInstance effect:flavor.getEffects()){
    			entityplayer.addPotionEffect(effect);
    		}
		}
	}

	public boolean inCookie(){
		return this.inCookie;
	}

	public EnumIceFlavor getFlavor() {
		return flavor;
	}

}
