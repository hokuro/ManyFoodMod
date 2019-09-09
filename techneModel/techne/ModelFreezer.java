// Date: 2016/10/16 23:22:17
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelModelFreezer extends ModelBase
{
  //fields
    ModelRenderer back;
    ModelRenderer front;
  
  public ModelModelFreezer()
  {
    textureWidth = 96;
    textureHeight = 64;
    
      back = new ModelRenderer(this, 0, 0);
      back.addBox(-7F, 1F, -6F, 14, 16, 13);
      back.setRotationPoint(0F, 1F, 0F);
      back.setTextureSize(64, 32);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      front = new ModelRenderer(this, 0, 30);
      front.addBox(0F, 0F, -3F, 14, 16, 2);
      front.setRotationPoint(-7F, 2F, -5F);
      front.setTextureSize(64, 32);
      front.mirror = true;
      setRotation(front, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    back.render(f5);
    front.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
