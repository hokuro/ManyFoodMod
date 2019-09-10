package mod.mfm.render;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.block.BlockIceCrasher;
import mod.mfm.model.ModelCrashedIce;
import mod.mfm.model.ModelCrashedIce.EnumCrashedIceLevel;
import mod.mfm.model.ModelIceCrasher;
import mod.mfm.tileentity.TileEntityIceCrasher;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderIceCrasher extends TileEntityRenderer<TileEntityIceCrasher> {
	private static final ResourceLocation tex = new ResourceLocation("mfm:textures/entity/icecrasher.png");
	private static final ResourceLocation tex_flape = new ResourceLocation("mfm:textures/entity/crashedice_none.png");

	private ModelIceCrasher mainModel = new ModelIceCrasher();
	private ModelCrashedIce subModel = new ModelCrashedIce();

	@Override
	public void render(TileEntityIceCrasher te, double x, double y, double z, float partialTicks, int destroyStage) {
		renderFlapeMaker((TileEntityIceCrasher)te,x,y,z,partialTicks,destroyStage);

	}


	public void renderFlapeMaker(TileEntityIceCrasher te, double x, double y, double z, float partialTicks, int destroyStage) {

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
		GlStateManager.enableBlend();
		GlStateManager.translatef((float) x + 0.5F , (float) y + 1.0F, (float) z + 0.5F);
		GlStateManager.scaled(0.0625D,0.0625D,0.0625D);
		GlStateManager.rotatef(180,0F,0F,1F);
		int idx = te.getBlockState().get(BlockIceCrasher.FACING).getHorizontalIndex();
		GlStateManager.rotatef(90F * (idx+2),0F,1F,0F);
		GlStateManager.enableCull();
		GlStateManager.enableRescaleNormal();
		this.mainModel.render(te, EnumCrashedIceLevel.LV4_FULL, 1.0F);
		GlStateManager.disableBlend();
		GlStateManager.popMatrix();
		if (te.isRunning() || te.getField(3)!=0){
			GlStateManager.pushMatrix();
			GlStateManager.enableBlend();
			GlStateManager.translatef((float) x + 0.5F , (float) y-0.42F, (float) z + 0.5F);
			GlStateManager.scaled(1.5D,1.5D,1.5D);
			GlStateManager.rotatef(0,0F,0F,1F);
			GlStateManager.enableCull();
			GlStateManager.enableRescaleNormal();
			this.bindTexture(tex_flape);
			if(te.isRunning()){
				this.subModel.render(EnumCrashedIceLevel.getValue(TileEntityIceCrasher.CRUSH_TIME_MAX, te.getField(0)), 0, 0, 0, 0.0125F);
			}else{
				this.subModel.render(EnumCrashedIceLevel.LV4_FULL, 0, 0, 0, 0.0125F);
			}
			GlStateManager.disableBlend();
			GlStateManager.popMatrix();
		}
        if (destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }
	}
}
