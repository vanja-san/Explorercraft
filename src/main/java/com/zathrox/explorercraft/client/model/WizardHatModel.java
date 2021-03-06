package com.zathrox.explorercraft.client.model;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

/**
 * ModelWizardHat - Zathrox
 * Created using Tabula 7.0.1
 */
public class WizardHatModel extends BipedModel {
	
    public RendererModel Hat_1;
    public RendererModel Hat_2;
    public RendererModel Hat_3;
    public RendererModel Hat_4;
    public RendererModel Hat_5;

    public WizardHatModel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Hat_3 = new RendererModel(this, 34, 84);
        this.Hat_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat_3.addBox(-2.0F, -14.0F, -7.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Hat_3, -0.5410520681182421F, 0.0F, 0.0F);
        this.Hat_2 = new RendererModel(this, 0, 95);
        this.Hat_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat_2.addBox(-4.0F, -11.0F, -6.0F, 8, 3, 8, 0.0F);
        this.setRotateAngle(Hat_2, -0.2792526803190927F, 0.0F, 0.0F);
        this.Hat_4 = new RendererModel(this, 40, 68);
        this.Hat_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat_4.addBox(-1.0F, -15.0F, -11.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Hat_4, -0.9948376736367678F, 0.0F, 0.0F);
        this.Hat_1 = new RendererModel(this, 0, 68);
        this.Hat_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat_1.addBox(-6.0F, -8.0F, -6.0F, 12, 1, 12, 0.0F);
        this.Hat_5 = new RendererModel(this, 0, 83);
        this.Hat_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat_5.addBox(-4.0F, -10.0F, -4.0F, 8, 2, 8, 0.0F);
        this.Hat_1.addChild(this.Hat_3);
        this.Hat_1.addChild(this.Hat_2);
        this.Hat_1.addChild(this.Hat_4);
        this.Hat_1.addChild(this.Hat_5);
        
        this.bipedHead.addChild(this.Hat_1);
    }

    @Override
    public void render(LivingEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	
        super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
