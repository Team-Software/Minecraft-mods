package com.trynow.adamod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelAdamantiumHorse extends ModelBase {
    public ModelRenderer Cabeza;
    public ModelRenderer PataDelIzq;
    public ModelRenderer PantoTraIzq;
    public ModelRenderer PataTraIzq;
    public ModelRenderer MusloDelIzq;
    public ModelRenderer MusloDelDer;
    public ModelRenderer PantoDelIzq;
    public ModelRenderer PantoDelDer;
    public ModelRenderer Cuerpo;
    public ModelRenderer ColaB;
    public ModelRenderer MusloTraIzq;
    public ModelRenderer CuelloA;
    public ModelRenderer CuelloB;
    public ModelRenderer ColaA;
    public ModelRenderer ColaC;
    public ModelRenderer MusloTraDer;
    public ModelRenderer PantoTraDer;
    public ModelRenderer PataTraDer;
    public ModelRenderer PataDelDer;
    public ModelRenderer AlaDer;
    public ModelRenderer AlaIzq;
    public ModelRenderer CuernoDer;
    public ModelRenderer CuernoIzq;
    public ModelRenderer HocicoA;
    public ModelRenderer HocicoB;

    public ModelAdamantiumHorse() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.ColaC = new ModelRenderer(this, 24, 3);
        this.ColaC.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.ColaC.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(ColaC, -1.5707963267948966F, 0.0F, 0.0F);
        this.ColaB = new ModelRenderer(this, 38, 7);
        this.ColaB.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.ColaB.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(ColaB, -1.3089969389957472F, 0.0F, 0.0F);
        this.MusloDelIzq = new ModelRenderer(this, 44, 29);
        this.MusloDelIzq.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.MusloDelIzq.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.MusloDelDer = new ModelRenderer(this, 60, 29);
        this.MusloDelDer.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.MusloDelDer.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.ColaA = new ModelRenderer(this, 44, 0);
        this.ColaA.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.ColaA.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(ColaA, -1.3089969389957472F, 0.0F, 0.0F);
        this.Cuerpo = new ModelRenderer(this, 0, 34);
        this.Cuerpo.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.Cuerpo.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.PantoDelDer = new ModelRenderer(this, 60, 41);
        this.PantoDelDer.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.PantoDelDer.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.MusloTraIzq = new ModelRenderer(this, 78, 29);
        this.MusloTraIzq.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.MusloTraIzq.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.PataTraDer = new ModelRenderer(this, 96, 51);
        this.PataTraDer.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.PataTraDer.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.PataDelDer = new ModelRenderer(this, 60, 51);
        this.PataDelDer.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.PataDelDer.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.PantoTraDer = new ModelRenderer(this, 96, 43);
        this.PantoTraDer.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.PantoTraDer.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.CuernoIzq = new ModelRenderer(this, 78, 29);
        this.CuernoIzq.setRotationPoint(0.0F, -4.0F, -8.0F);
        this.CuernoIzq.addBox(0.0F, 0.0F, 0.0F, 4, 9, 5, 0.0F);
        this.setRotateAngle(CuernoIzq, -3.6651914291880923F, 0.0F, 0.0F);
        this.AlaDer = new ModelRenderer(this, 0, 12);
        this.AlaDer.setRotationPoint(-4.0F, 9.5F, 0.0F);
        this.AlaDer.addBox(0.0F, 0.0F, 0.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(AlaDer, 1.7453292519943295F, -1.5707963267948966F, 0.0F);
        this.PataDelIzq = new ModelRenderer(this, 44, 51);
        this.PataDelIzq.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.PataDelIzq.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.CuelloB = new ModelRenderer(this, 58, 0);
        this.CuelloB.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.CuelloB.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(CuelloB, 0.5235987755982988F, 0.0F, 0.0F);
        this.Cabeza = new ModelRenderer(this, 0, 0);
        this.Cabeza.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.Cabeza.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Cabeza, 0.5235987755982988F, 0.0F, 0.0F);
        this.PantoTraIzq = new ModelRenderer(this, 78, 43);
        this.PantoTraIzq.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.PantoTraIzq.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.PantoDelIzq = new ModelRenderer(this, 44, 41);
        this.PantoDelIzq.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.PantoDelIzq.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.MusloTraDer = new ModelRenderer(this, 96, 29);
        this.MusloTraDer.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.MusloTraDer.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.HocicoB = new ModelRenderer(this, 24, 27);
        this.HocicoB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HocicoB.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.PataTraIzq = new ModelRenderer(this, 78, 51);
        this.PataTraIzq.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.PataTraIzq.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.HocicoA = new ModelRenderer(this, 24, 18);
        this.HocicoA.setRotationPoint(0.0F, 0.02F, 0.02F);
        this.HocicoA.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.CuernoDer = new ModelRenderer(this, 96, 29);
        this.CuernoDer.setRotationPoint(-4.0F, -4.0F, -8.0F);
        this.CuernoDer.addBox(0.0F, 0.0F, 0.0F, 4, 9, 5, 0.0F);
        this.setRotateAngle(CuernoDer, -3.6651914291880923F, 0.0F, 0.0F);
        this.CuelloA = new ModelRenderer(this, 0, 12);
        this.CuelloA.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.CuelloA.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(CuelloA, 0.5235987755982988F, 0.0F, 0.0F);
        this.AlaIzq = new ModelRenderer(this, 0, 12);
        this.AlaIzq.setRotationPoint(4.0F, 9.5F, 4.0F);
        this.AlaIzq.addBox(0.0F, 0.0F, 0.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(AlaIzq, 1.7453292519943295F, 1.5707963267948966F, 0.0F);
        this.Cabeza.addChild(this.HocicoB);
        this.Cabeza.addChild(this.HocicoA);
    }

    //Identificación de las partes del sprite
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    
    	this.Cabeza.render(f5);
    	this.CuelloA.render(f5);
        this.CuelloB.render(f5);
        this.Cuerpo.render(f5);
        this.MusloDelIzq.render(f5);
        this.PantoDelIzq.render(f5);
        this.PataDelIzq.render(f5);
        this.MusloTraIzq.render(f5);
        this.PantoTraIzq.render(f5);
        this.PataTraIzq.render(f5);
        this.MusloDelDer.render(f5);
        this.PantoDelDer.render(f5);
        this.PataDelDer.render(f5);
        this.MusloTraDer.render(f5);
        this.PantoTraDer.render(f5);
        this.PataTraDer.render(f5);
        this.ColaA.render(f5);
    	this.ColaC.render(f5);
        this.ColaB.render(f5);
        
    	this.CuernoIzq.render(f5);
    	this.CuernoDer.render(f5);
        this.AlaDer.render(f5);
        this.AlaIzq.render(f5);
       
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,float headPitch, float scaleFactor, Entity entityIn)
    {
    	//Patas Izquierda
    	this.MusloDelIzq.rotateAngleX = MathHelper.cos(limbSwing*0.6662F) * 1.4F * limbSwingAmount;
    	this.PantoDelIzq.rotateAngleX = MathHelper.cos(limbSwing*0.6662F) * 1.4F * limbSwingAmount;
    	this.PataDelIzq.rotateAngleX = MathHelper.cos(limbSwing*0.6662F) * 1.4F * limbSwingAmount;
    	this.MusloTraIzq.rotateAngleX = MathHelper.cos(limbSwing*0.6662F) * 1.4F * limbSwingAmount;
    	this.PantoTraIzq.rotateAngleX = MathHelper.cos(limbSwing*0.6662F) * 1.4F * limbSwingAmount;
    	this.PataTraIzq.rotateAngleX = MathHelper.cos(limbSwing*0.6662F) * 1.4F * limbSwingAmount;
    	
    	
    	//Patas Derecha
    	this.MusloDelDer.rotateAngleX = MathHelper.cos(limbSwing*0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.PantoDelDer.rotateAngleX = MathHelper.cos(limbSwing*0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.PataDelDer.rotateAngleX = MathHelper.cos(limbSwing*0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.MusloTraDer.rotateAngleX = MathHelper.cos(limbSwing*0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.PantoTraDer.rotateAngleX = MathHelper.cos(limbSwing*0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.PataTraDer.rotateAngleX = MathHelper.cos(limbSwing*0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	
 
    }
}
