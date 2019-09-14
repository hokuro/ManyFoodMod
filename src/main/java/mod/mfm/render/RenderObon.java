package mod.mfm.render;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.entity.EntityObon;
import mod.mfm.model.ModelObon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RenderObon extends EntityRenderer<EntityObon> {
	private ModelObon mainmodel;
	private static final ResourceLocation tex = new ResourceLocation("mfm:textures/entity/obon.png");
	private MyItemRenderer itemRender;

	public RenderObon(EntityRendererManager renderManager) {
		super(renderManager);
		shadowSize = 0.1F;
		mainmodel = new ModelObon();
		itemRender = new MyItemRenderer(Minecraft.getInstance().getRenderManager(), Minecraft.getInstance().getItemRenderer());
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityObon entity) {
		return tex;
	}

    @Override
    public void doRender(EntityObon entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
    	doRenderIceCream(entity, x, y, z, entityYaw, partialTicks);
    }

	public void doRenderIceCream(EntityObon obon, double x, double y, double z, float yaw, float tic) {
		// レンダリング実装
		// レンダリング

		shadowSize = 0.2F;
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y+0.1F, (float)z);
		GL11.glRotatef(180, 0.0F, 0.0F, 0.0F);
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		GlStateManager.enableBlend();
		bindEntityTexture(obon);
		mainmodel.render(obon,(float)x,(float)y,(float)z,yaw,tic,0.0625F);
		GlStateManager.disableBlend();
		GL11.glPopMatrix();

		if (obon.hasFood()) {
			ItemStack stack = obon.getFood();
			ItemEntity itement = new ItemEntity(Minecraft.getInstance().world, x, y, z, stack);
			itemRender.doRender(itement, x, y, z, yaw, tic);
		}
	}
}
