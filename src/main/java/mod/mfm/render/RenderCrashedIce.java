	package mod.mfm.render;

	import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.config.ConfigValue;
import mod.mfm.entity.EntityCrashedIce;
import mod.mfm.model.ModelCrashedIce;
import mod.mfm.model.ModelCrashedIce.EnumCrashedIceLevel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class RenderCrashedIce extends EntityRenderer<EntityCrashedIce> {
	private ModelCrashedIce mainmodel;

	public RenderCrashedIce(EntityRendererManager renderManager) {
		super(renderManager);
		shadowSize = 0.1F;
		mainmodel = new ModelCrashedIce();
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCrashedIce entity) {
		if (entity.isMillk()){
			return  entity.getFlavor().getMilkCrushIceTexture();
		}else{
			return  entity.getFlavor().getCrushIceTexture();
		}
	}

    @Override
    public void doRender(EntityCrashedIce entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
    	doRenderIceCream(entity, x, y, z, entityYaw, partialTicks);
    }

	public void doRenderIceCream(EntityCrashedIce icecream, double x, double y, double z, float yaw, float tic) {
		// レンダリング実装
		// レンダリング

		shadowSize = 0.2F;
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y-0.69F, (float)z);
		GL11.glRotatef(180F - yaw, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		GlStateManager.enableBlend();
		bindEntityTexture(icecream);

		int limit = ConfigValue.crashedice.MelltingTime()/(EnumCrashedIceLevel.getLevelCnt()-1);
		int level = (int) Math.ceil((double)icecream.countdown()/limit);

		mainmodel.render(EnumCrashedIceLevel.getLevel(level),0,0,0,0.0625F);
		GlStateManager.disableBlend();
		GL11.glPopMatrix();
	}
}
