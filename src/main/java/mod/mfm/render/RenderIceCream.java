package mod.mfm.render;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.config.ConfigValue;
import mod.mfm.entity.EntityIceCream;
import mod.mfm.model.ModelIcecream;
import mod.mfm.model.ModelIcecream.EnumIcecreamLevel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class RenderIceCream extends EntityRenderer<EntityIceCream> {

	private ModelIcecream mainmodel;

	public RenderIceCream(EntityRendererManager renderManager) {
		super(renderManager);
		shadowSize = 0.1F;
		mainmodel = new ModelIcecream();
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityIceCream entity) {
		if (entity.isInCookie()){
			return entity.getFlavor().getIceCookieTexture();
		}
		return  entity.getFlavor().getIceTexture();
	}

    @Override
    public void doRender(EntityIceCream entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
    	doRenderIceCream(entity, x, y, z, entityYaw, partialTicks);
    }

	public void doRenderIceCream(EntityIceCream icecream, double x, double y, double z, float yaw, float tic) {
		// レンダリング実装
		// レンダリング

		shadowSize = 0.2F;
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y-0.69F, (float)z);
		GL11.glRotatef(180F - yaw, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		GlStateManager.enableBlend();
		bindEntityTexture(icecream);

		int limit = ConfigValue.icecream.MelltingTime()/(EnumIcecreamLevel.getLevelCnt());
		int level = (int) Math.ceil((double)icecream.countdown()/limit);

		mainmodel.render(EnumIcecreamLevel.getLevel(level),0.0625F);
		GlStateManager.disableBlend();
		GL11.glPopMatrix();
	}

}
