package mod.mfm.model;

import mod.mfm.entity.EntityObon;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class ModelObon extends EntityModel<EntityObon>{
	//fields
    RendererModel Shape1;
    RendererModel Shape2;
    RendererModel Shape3;
    RendererModel Shape4;
    RendererModel Shape5;

  public ModelObon()
  {
    textureWidth = 64;
    textureHeight = 32;

      Shape1 = new RendererModel(this, 0, 0);
      Shape1.addBox(-5F, 0F, -5F, 10, 1, 10);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new RendererModel(this, 0, 13);
      Shape2.addBox(-5F, -1F, 4F, 10, 1, 1);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new RendererModel(this, 0, 11);
      Shape3.addBox(-5F, -1F, -5F, 10, 1, 1);
      Shape3.setRotationPoint(0F, 0F, 0F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new RendererModel(this, 40, 0);
      Shape4.addBox(-5F, -1F, -4F, 1, 1, 8);
      Shape4.setRotationPoint(0F, 0F, 0F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new RendererModel(this, 40, 9);
      Shape5.addBox(4F, -1F, -4F, 1, 1, 8);
      Shape5.setRotationPoint(0F, 0F, 0F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }

  @Override
  public void render(EntityObon entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
  }

  private void setRotation(RendererModel model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
