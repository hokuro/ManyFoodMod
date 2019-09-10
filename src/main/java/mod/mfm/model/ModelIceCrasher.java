// Date: 2016/10/04 21:48:14
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package mod.mfm.model;

import mod.mfm.entity.EntityIceCream;
import mod.mfm.model.ModelCrashedIce.EnumCrashedIceLevel;
import mod.mfm.tileentity.TileEntityIceCrasher;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class ModelIceCrasher extends EntityModel<EntityIceCream>
{
 //fields
    RendererModel bottom1;
    RendererModel bottom2;
    RendererModel body;
    RendererModel body2;
    RendererModel shaft;
    RendererModel handl1;
    RendererModel handl2;
    RendererModel handl3;
    RendererModel handl4;
    RendererModel handle5;
    RendererModel handle6;
    RendererModel handle7;
    RendererModel handle8;
    RendererModel handle;
    RendererModel leg1;
    RendererModel leg2;
    RendererModel leg3;
    RendererModel leg4;
    RendererModel ice;
    RendererModel pless;
    RendererModel plessshaft;
    RendererModel box;
    RendererModel body3;
    RendererModel body4;
    RendererModel body5;
    RendererModel body6;
    RendererModel body7;

    ModelCrashedIce crashedIce;

  public ModelIceCrasher()
  {
    textureWidth = 64;
    textureHeight = 32;
    body = new RendererModel(this, 0, 0);
    body.addBox(-6F, 1F, -4F, 11, 2, 9);
    body.setRotationPoint(0F, 0F, 0F);
    body.setTextureSize(64, 32);
    body.mirror = true;
    setRotation(body, 0F, 0F, 0F);
    body2 = new RendererModel(this, 0, 22);
    body2.addBox(-6F, 14F, -4F, 11, 1, 9);
    body2.setRotationPoint(0F, -5F, 0F);
    body2.setTextureSize(64, 32);
    body2.mirror = true;
    setRotation(body2, 0F, 0F, 0F);
    body3 = new RendererModel(this, 60, 0);
    body3.addBox(-6F, 3F, -3F, 1, 6, 1);
    body3.setRotationPoint(0F, 0F, 0F);
    body3.setTextureSize(64, 32);
    body3.mirror = true;
    setRotation(body3, 0F, 0F, 0F);
    body3.mirror = false;
    body4 = new RendererModel(this, 60, 0);
    body4.addBox(4F, 3F, -2F, 1, 6, 1);
    body4.setRotationPoint(0F, 0F, 0F);
    body4.setTextureSize(64, 32);
    body4.mirror = true;
    setRotation(body4, 0F, 0F, 0F);
    body5 = new RendererModel(this, 60, 0);
    body5.addBox(-6F, 3F, 3F, 1, 6, 1);
    body5.setRotationPoint(0F, 0F, 0F);
    body5.setTextureSize(64, 32);
    body5.mirror = true;
    setRotation(body5, 0F, 0F, 0F);
    body6 = new RendererModel(this, 60, 0);
    body6.addBox(-6F, 3F, 0F, 1, 6, 1);
    body6.setRotationPoint(0F, 0F, 0F);
    body6.setTextureSize(64, 32);
    body6.mirror = true;
    setRotation(body6, 0F, 0F, 0F);
    body7 = new RendererModel(this, 60, 0);
    body7.addBox(4F, 3F, 2F, 1, 6, 1);
    body7.setRotationPoint(0F, 0F, 0F);
    body7.setTextureSize(64, 32);
    body7.mirror = true;
    setRotation(body7, 0F, 0F, 0F);

    leg1 = new RendererModel(this, 60, 18);
    leg1.addBox(-5.5F, 3F, -3.5F, 1, 14, 1);
    leg1.setRotationPoint(0F, 0F, 0F);
    leg1.setTextureSize(64, 32);
    leg1.mirror = true;
    setRotation(leg1, -0.1396263F, 0F, 0.0698132F);
    leg2 = new RendererModel(this, 60, 18);
    leg2.addBox(-5.5F, 3F, 3.5F, 1, 14, 1);
    leg2.setRotationPoint(0F, 0F, 0F);
    leg2.setTextureSize(64, 32);
    leg2.mirror = true;
    setRotation(leg2, 0.1396263F, 0F, 0.0698132F);
    leg3 = new RendererModel(this, 60, 18);
    leg3.addBox(3.5F, 3F, 3.5F, 1, 13, 1);
    leg3.setRotationPoint(0F, 0F, 0F);
    leg3.setTextureSize(64, 32);
    leg3.mirror = true;
    setRotation(leg3, 0.1396263F, 0F, -0.0698132F);
    leg4 = new RendererModel(this, 60, 18);
    leg4.addBox(3.5F, 3F, -3.5F, 1, 14, 1);
    leg4.setRotationPoint(0F, 0F, 0F);
    leg4.setTextureSize(64, 32);
    leg4.mirror = true;
    setRotation(leg4, -0.1396263F, 0F, -0.0698132F);

    bottom1 = new RendererModel(this, 0, 19);
    bottom1.addBox(-7F, 15F, -1F, 13, 1, 2);
    bottom1.setRotationPoint(-6F, 0F, 0F);
    bottom1.setTextureSize(64, 32);
    bottom1.mirror = true;
    setRotation(bottom1, 0F, 1.570796F, 0F);
    bottom2 = new RendererModel(this, 0, 19);
    bottom2.addBox(-8F, 15F, -1F, 13, 1, 2);
    bottom2.setRotationPoint(5F, 0F, -1F);
    bottom2.setTextureSize(64, 32);
    bottom2.mirror = true;
    setRotation(bottom2, 0F, 1.570796F, 0F);



      shaft = new RendererModel(this, 46, 30);
      shaft.addBox(-4F, 0F, -0.5F, 6, 1, 1);
      shaft.setRotationPoint(5F, 3F, 0F);
      shaft.setTextureSize(64, 32);
      shaft.mirror = true;
      setRotation(shaft, 0F, 0F, 0F);
      handl1 = new RendererModel(this, 44, 21);
      handl1.addBox(2F, -2F, 2.5F, 1, 5, 1);
      handl1.setRotationPoint(4F, 3F, 0F);
      handl1.setTextureSize(64, 32);
      handl1.mirror = true;
      setRotation(handl1, 0F, 0F, 0F);
      handl2 = new RendererModel(this, 44, 21);
      handl2.addBox(2F, -2F, -3.5F, 1, 5, 1);
      handl2.setRotationPoint(4F, 3F, 0F);
      handl2.setTextureSize(64, 32);
      handl2.mirror = true;
      setRotation(handl2, 0F, 0F, 0F);
      handl3 = new RendererModel(this, 48, 21);
      handl3.addBox(2F, -3F, -2.5F, 1, 1, 5);
      handl3.setRotationPoint(4F, 3F, 0F);
      handl3.setTextureSize(64, 32);
      handl3.mirror = true;
      setRotation(handl3, 0F, 0F, 0F);
      handl4 = new RendererModel(this, 48, 21);
      handl4.addBox(2F, 3F, -2.5F, 1, 1, 5);
      handl4.setRotationPoint(4F, 3F, 0F);
      handl4.setTextureSize(64, 32);
      handl4.mirror = true;
      setRotation(handl4, 0F, 0F, 0F);
      handle5 = new RendererModel(this, 56, 27);
      handle5.addBox(2F, 1F, -0.5F, 1, 2, 1);
      handle5.setRotationPoint(4F, 3F, 0F);
      handle5.setTextureSize(64, 32);
      handle5.mirror = true;
      setRotation(handle5, 0F, 0F, 0F);
      handle6 = new RendererModel(this, 56, 27);
      handle6.addBox(2F, -2F, -0.5F, 1, 2, 1);
      handle6.setRotationPoint(4F, 3F, 0F);
      handle6.setTextureSize(64, 32);
      handle6.mirror = true;
      setRotation(handle6, 0F, 0F, 0F);
      handle7 = new RendererModel(this, 50, 27);
      handle7.addBox(2F, 0F, 0.5F, 1, 1, 2);
      handle7.setRotationPoint(4F, 3F, 0F);
      handle7.setTextureSize(64, 32);
      handle7.mirror = true;
      setRotation(handle7, 0F, 0F, 0F);
      handle8 = new RendererModel(this, 50, 27);
      handle8.addBox(2F, 0F, -2.5F, 1, 1, 2);
      handle8.setRotationPoint(4F, 3F, 0F);
      handle8.setTextureSize(64, 32);
      handle8.mirror = true;
      setRotation(handle8, 0F, 0F, 0F);
      handle = new RendererModel(this, 46, 28);
      handle.addBox(3F, 0F, 2.5F, 1, 1, 1);
      handle.setRotationPoint(4F, 3F, 0F);
      handle.setTextureSize(64, 32);
      handle.mirror = true;
      setRotation(handle, 0F, 0F, 0F);

      pless = new RendererModel(this, 48, 0);
      pless.addBox(-1.5F, 3F, -1.5F, 3, 1, 3);
      pless.setRotationPoint(0F, 3F, 0F);
      pless.setTextureSize(64, 32);
      pless.mirror = true;
      setRotation(pless, 0F, 0F, 0F);
      plessshaft = new RendererModel(this, 56, 4);
      plessshaft.addBox(-0.5F, -1F, -0.5F, 1, 4, 1);
      plessshaft.setRotationPoint(0F, 3F, 0F);
      plessshaft.setTextureSize(64, 32);
      plessshaft.mirror = true;
      setRotation(plessshaft, 0F, 0F, 0F);
      box = new RendererModel(this, 40, 4);
      box.addBox(-1.5F, -1F, -1.5F, 3, 3, 3);
      box.setRotationPoint(0F, 3F, 0F);
      box.setTextureSize(64, 32);
      box.mirror = true;
      setRotation(box, 0F, 0F, 0F);

      ice = new RendererModel(this, 40, 0);
      ice.addBox(-1F, -1F, -1F, 2, 2, 2);
      ice.setRotationPoint(0F, 8F, 0F);
      ice.setTextureSize(64, 32);
      ice.mirror = true;
      setRotation(ice, 0F, 0F, 0F);

      crashedIce = new ModelCrashedIce();

  }


  public void render(TileEntityIceCrasher te, EnumCrashedIceLevel level, float scale){
	  // body
	    body.render(scale);
	    body2.render(scale);
	    body3.render(scale);
	    body4.render(scale);
	    body5.render(scale);
	    body6.render(scale);
	    body7.render(scale);

	    // leg
	    leg1.render(scale);
	    leg2.render(scale);
	    leg3.render(scale);
	    leg4.render(scale);

	    // bottom
	    bottom1.render(scale);
	    bottom2.render(scale);

	    float l = (float)te.getField(0)/TileEntityIceCrasher.CRUSH_TIME_MAX;
	    float hR = (float)(12*Math.PI * l);
	    setRotation(shaft,hR,0,0);
	    setRotation(handl1,hR,0,0);
	    setRotation(handl2,hR,0,0);
	    setRotation(handl3,hR,0,0);
	    setRotation(handl4,hR,0,0);
	    setRotation(handle5,hR,0,0);
	    setRotation(handle6,hR,0,0);
	    setRotation(handle7,hR,0,0);
	    setRotation(handle8,hR,0,0);
	    setRotation(handle,hR,0,0);

	    // handle
	    shaft.render(scale);
	    handl1.render(scale);
	    handl2.render(scale);
	    handl3.render(scale);
	    handl4.render(scale);
	    handle5.render(scale);
	    handle6.render(scale);
	    handle7.render(scale);
	    handle8.render(scale);
	    handle.render(scale);
	    box.render(scale);


	    float shaftRY = (float)(6*Math.PI * l);
	    if (!te.isSetIce()){
	    	pless.offsetY = 2;
	    	plessshaft.offsetY = 2;
	    	ice.offsetY = 0;
	    	ice.isHidden = true;
	    }else{
	    	pless.offsetY = 2 * l;
	    	plessshaft.offsetY = 2*l;
	    	ice.offsetY = 1*l;
	    	ice.isHidden = false;
	    }

    	setRotation(pless,0,shaftRY,0);
	    setRotation(plessshaft,0,shaftRY,0);
	    setRotation(ice,0,shaftRY,0);
    	pless.render(scale);
    	plessshaft.render(scale);
    	ice.render(scale);



  }

  private void setRotation(RendererModel model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}