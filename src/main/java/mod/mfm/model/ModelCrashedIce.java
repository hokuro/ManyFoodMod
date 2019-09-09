// Date: 2016/10/05 23:44:37
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package mod.mfm.model;

import mod.mfm.entity.EntityCrashedIce;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class ModelCrashedIce extends EntityModel<EntityCrashedIce>
{
  //fields
    RendererModel casebase;
    RendererModel casecupsid4;
    RendererModel casecupsid3;
    RendererModel caseporl;
    RendererModel casecupbase;
    RendererModel casecupsid2;
    RendererModel casecupsid1;
    RendererModel ice1;
    RendererModel ice2;
    RendererModel ice3;

    private RendererModel[] models;

  public ModelCrashedIce()
  {
	    textureWidth = 64;
	    textureHeight = 32;

	      casebase = new RendererModel(this, 0, 0);
	      casebase.addBox(-3F, 0F, -3F, 6, 1, 6);
	      casebase.setRotationPoint(0F, 23F, 0F);
	      casebase.setTextureSize(64, 32);
	      casebase.mirror = true;
	      setRotation(casebase, 0F, 0F, 0F);

	      casecupsid4 = new RendererModel(this, 33, 5);
	      casecupsid4.addBox(-4F, 8F, -5F, 8, 3, 1);
	      casecupsid4.setRotationPoint(0F, 23F, 0F);
	      casecupsid4.setTextureSize(64, 32);
	      casecupsid4.mirror = true;
	      setRotation(casecupsid4, 0F, -1.570796F, 0F);

	      casecupsid3 = new RendererModel(this, 33, 15);
	      casecupsid3.addBox(-4F, 8F, -5F, 8, 3, 1);
	      casecupsid3.setRotationPoint(0F, 23F, 0F);
	      casecupsid3.setTextureSize(64, 32);
	      casecupsid3.mirror = true;
	      setRotation(casecupsid3, 0F, 1.570796F, 0F);

	      casecupsid2 = new RendererModel(this, 33, 0);
	      casecupsid2.addBox(-4F, 8F, -5F, 8, 3, 1);
	      casecupsid2.setRotationPoint(0F, 23F, 0F);
	      casecupsid2.setTextureSize(64, 32);
	      casecupsid2.mirror = true;
	      setRotation(casecupsid2, 0F, 0F, 0F);

	      casecupsid1 = new RendererModel(this, 33, 10);
	      casecupsid1.addBox(-4F, 8F, 4F, 8, 3, 1);
	      casecupsid1.setRotationPoint(0F, 23F, 0F);
	      casecupsid1.setTextureSize(64, 32);
	      casecupsid1.mirror = true;
	      setRotation(casecupsid1, 0F, 0F, 0F);


	      caseporl = new RendererModel(this, 24, 0);
	      caseporl.addBox(-1F, 1F, -1F, 2, 6, 2);
	      caseporl.setRotationPoint(0F, 23F, 0F);
	      caseporl.setTextureSize(64, 32);
	      caseporl.mirror = true;
	      setRotation(caseporl, 0F, 0F, 0F);

	      casecupbase = new RendererModel(this, 0, 8);
	      casecupbase.addBox(-4F, 7F, -4F, 8, 1, 8);
	      casecupbase.setRotationPoint(0F, 23F, 0F);
	      casecupbase.setTextureSize(64, 32);
	      casecupbase.mirror = true;
	      setRotation(casecupbase, 0F, 0F, 0F);

	      ice1 = new RendererModel(this, 0, 17);
	      ice1.addBox(-3F, 8F, -3F, 6, 4, 6);
	      ice1.setRotationPoint(0F, 23F, 0F);
	      ice1.setTextureSize(64, 32);
	      ice1.mirror = true;
	      setRotation(ice1, 0F, 0F, 0F);

	      ice2 = new RendererModel(this, 25, 20);
	      ice2.addBox(-2F, 11F, -2F, 4, 3, 4);
	      ice2.setRotationPoint(0F, 23F, 0F);
	      ice2.setTextureSize(64, 32);
	      ice2.mirror = true;
	      setRotation(ice2, 0F, 0F, 0F);

	      ice3 = new RendererModel(this, 42, 23);
	      ice3.addBox(-1F, 13F, -1F, 2, 2, 2);
	      ice3.setRotationPoint(0F, 23F, 0F);
	      ice3.setTextureSize(64, 32);
	      ice3.mirror = true;
	      setRotation(ice3, 0F, 0F, 0F);
      models = new RendererModel[]{ice3,ice2,ice1,casebase,caseporl,casecupbase,casecupsid1,casecupsid2,casecupsid3,casecupsid4};
  }


  public void render(EnumCrashedIceLevel level, float rx, float ry, float rz, float scale){
	  switch(level){
		case LV0_NONE:
			ice1.isHidden = true;
			ice2.isHidden = true;
			ice3.isHidden = true;
			break;
		case LV1_SMALL:
			ice1.isHidden = false;
			ice2.isHidden = true;
			ice3.isHidden = true;
			break;
		case LV2_MIDIUM:
			ice1.isHidden = false;
			ice2.isHidden = false;
			ice3.isHidden = true;
			break;
		case LV3_LARGE:
			ice1.isHidden = false;
			ice2.isHidden = false;
			ice3.isHidden = false;
			break;
		default:
			ice1.isHidden = false;
			ice2.isHidden = false;
			ice3.isHidden = false;
			break;
	  }
	  setRotation(casebase,rx,ry,rz);
	  setRotation(casecupsid4,rx,ry-1.570796F,rz);
	  setRotation(casecupsid3,rx,ry+1.570796F,rz);
	  setRotation(caseporl,rx,ry,rz);
	  setRotation(casecupbase,rx,ry,rz);
	  setRotation(casecupsid2,rx,ry,rz);
	  setRotation(casecupsid1,rx,ry,rz);
	  setRotation(ice1,rx,ry,rz);
	  setRotation(ice2,rx,ry,rz);
	  setRotation(ice3,rx,ry,rz);

	  for (int i = 0; i < models.length; i++){
		  models[i].render(scale);
	  }
  }

  private void setRotation(RendererModel model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public static enum EnumCrashedIceLevel{
	  LV0_NONE,
	  LV1_SMALL,
	  LV2_MIDIUM,
	  LV3_LARGE,
	  LV4_FULL;

	  private static final EnumCrashedIceLevel[] values = {LV0_NONE,LV1_SMALL,LV2_MIDIUM,LV3_LARGE,LV4_FULL};

	  public static int getLevelCnt(){return values.length;}

	  public static EnumCrashedIceLevel getValue(int max, int cnt){
		  int limit = max / values.length;
		  int level = cnt/limit;
		  if (level < 0){level = 0;}
		  if (level >= values.length){level = values.length-1;}
		  return values[level];
	  }

	  public static EnumCrashedIceLevel getLevel(int level){
		  if (level < 0){return values[0];}
		  if (level >= values.length){return values[values.length-1];}
		  return values[level];
	  }
  }

}
