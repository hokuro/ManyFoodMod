package mod.mfm.render;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.model.ModelMillStone;
import mod.mfm.tileentity.TileEntityMillStone;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderMillStone extends TileEntityRenderer<TileEntityMillStone> {

	private static final ResourceLocation tex = new ResourceLocation("mfm:textures/entity/millstone.png");

	private ModelMillStone mainModel = new ModelMillStone();
	@Override
	public void render(TileEntityMillStone te, double x, double y, double z, float partialTicks, int destroyStage) {
		renderMill((TileEntityMillStone)te,x,y,z,partialTicks,destroyStage);

	}


	public void renderMill(TileEntityMillStone te, double x, double y, double z, float partialTicks, int destroyStage) {
        if (destroyStage >= 0)
        {
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scalef(5.0F, 4.0F, 1.0F);
            GlStateManager.translated(0.0625D, 0.0625D, 0.0625D);
            GlStateManager.matrixMode(5888);
        }else{
    		this.bindTexture(tex);
        }
		GlStateManager.pushMatrix();
		GlStateManager.translated((float) x + 0.5F , (float) y + 1.5F, (float) z + 0.5F);
		GlStateManager.scaled(0.0625D,0.0625D,0.0625D);
		GlStateManager.rotatef(180,0F,0F,1F);
		GlStateManager.enableCull();
		GlStateManager.enableRescaleNormal();
		float rotate = (float)(4*Math.PI*(((float)te.getField(0)/(float)TileEntityMillStone.MILL_TIME_MAX)));
		this.mainModel.render(1.0F,rotate);
		GlStateManager.popMatrix();
        if (destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }
	}

}
