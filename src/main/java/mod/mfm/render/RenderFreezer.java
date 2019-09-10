package mod.mfm.render;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.block.BlockFreezer;
import mod.mfm.model.ModelFreezer;
import mod.mfm.tileentity.TileEntityFreezer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderFreezer extends TileEntityRenderer<TileEntityFreezer> {
	private static final ResourceLocation tex = new ResourceLocation("mfm:textures/entity/freezer.png");

	private ModelFreezer mainModel = new ModelFreezer();

	@Override
	public void render(TileEntityFreezer te, double x, double y, double z, float partialTicks, int destroyStage) {
		renderFreezer(te,x,y,z,partialTicks,destroyStage);
	}

	public void renderFreezer(TileEntityFreezer te, double x, double y, double z, float partialTicks, int destroyStage) {
        if (destroyStage >= 0)
        {
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scalef(5.0F, 4.0F, 1.0F);
            GlStateManager.translatef(0.0625F, 0.0625F, 0.0625F);
            GlStateManager.matrixMode(5888);
        }else{
    		this.bindTexture(tex);
        }
		GlStateManager.pushMatrix();
		GlStateManager.translatef((float) x + 0.5F , (float) y + 1.13F, (float) z + 0.5F);
		GlStateManager.scaled(0.0625,0.0625,0.0625D);
		GlStateManager.rotatef(180,0F,0F,1F);
		int idx = te.getBlockState().get(BlockFreezer.FACING).getHorizontalIndex();
		GlStateManager.rotatef(90F * (idx+2),0F,1F,0F);
		GlStateManager.enableCull();
		GlStateManager.enableRescaleNormal();
		GlStateManager.disableLighting();
		GLX.glMultiTexCoord2f(GLX.GL_TEXTURE1, 15 * 16, 15 * 16);
		float rotate = te.prevLidAngle + (te.lidAngle - te.prevLidAngle) * partialTicks;
		rotate = (rotate * ((float)Math.PI / 2F));
		this.mainModel.render(1.0F, rotate);
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
        if (destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }
	}

}
