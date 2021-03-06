/**
 * This class was created by <wiiv>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [? (GMT)]
 */
package vazkii.botania.client.model.armor;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

import javax.annotation.Nonnull;

public class ModelArmorTerrasteel extends ModelArmor {

	private final RendererModel helmAnchor;
	private final RendererModel helm;
	private final RendererModel helmFront;
	private final RendererModel helmLeaf1l;
	private final RendererModel helmLeaf2l;
	private final RendererModel helmLeaf3l;
	private final RendererModel helmLeaf1r;
	private final RendererModel helmLeaf2r;
	private final RendererModel helmLeaf3r;
	private final RendererModel helmbranch1l;
	private final RendererModel helmbranch2l;
	private final RendererModel helmbranch1r;
	private final RendererModel helmbranch2r;

	private final RendererModel bodyAnchor;
	private final RendererModel bodyTop;
	private final RendererModel bodyBottom;
	
	private final RendererModel armLAnchor;
	private final RendererModel armL;
	private final RendererModel armLpauldron;
	private final RendererModel armLbranch1;
	private final RendererModel armLbranch2;
	
	private final RendererModel armRAnchor;
	private final RendererModel armR;
	private final RendererModel armRpauldron;
	private final RendererModel armRbranch1;
	private final RendererModel armRbranch2;
	
	private final RendererModel pantsAnchor;
	private final RendererModel belt;
	private final RendererModel legL;
	private final RendererModel legR;
	
	private final RendererModel bootL;
	private final RendererModel bootLtop;
	private final RendererModel bootLbranch1;
	private final RendererModel bootLbranch2;
	
	private final RendererModel bootR;
	private final RendererModel bootRtop;
	private final RendererModel bootRbranch1;
	private final RendererModel bootRbranch2;
	
	public ModelArmorTerrasteel(EquipmentSlotType slot) {
		super(slot);

		textureWidth = 64;
		textureHeight = 128;
		float s = 0.01F;
		
		//helm
        this.helmAnchor = new RendererModel(this, 0, 0);
        this.helmAnchor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.helmAnchor.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 2, s);
        this.helm = new RendererModel(this, 0, 0);
        this.helm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.helm.addBox(-4.5F, -9.0F, -4.5F, 9, 11, 9, s);
        this.helmFront = new RendererModel(this, 36, 0);
        this.helmFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.helmFront.addBox(-1.5F, -10.0F, -5.5F, 3, 8, 7, s);
        this.helmLeaf1l = new RendererModel(this, 56, 14);
        this.helmLeaf1l.mirror = true;
        this.helmLeaf1l.setRotationPoint(4.5F, -6.0F, -2.5F);
        this.helmLeaf1l.addBox(0.0F, -3.0F, -1.0F, 2, 3, 1, s);
        this.setRotateAngle(helmLeaf1l, -0.2617993877991494F, -0.2617993877991494F, 0.5235987755982988F);
        this.helmLeaf2l = new RendererModel(this, 56, 8);
        this.helmLeaf2l.mirror = true;
        this.helmLeaf2l.setRotationPoint(4.5F, -6.0F, -0.5F);
        this.helmLeaf2l.addBox(0.0F, -5.0F, -1.0F, 2, 5, 1, s);
        this.setRotateAngle(helmLeaf2l, -0.5235987755982988F, -0.5235987755982988F, 0.7853981633974483F);
        this.helmLeaf3l = new RendererModel(this, 56, 0);
        this.helmLeaf3l.mirror = true;
        this.helmLeaf3l.setRotationPoint(4.5F, -6.0F, 2.5F);
        this.helmLeaf3l.addBox(0.0F, -7.0F, -1.0F, 2, 7, 1, s);
        this.setRotateAngle(helmLeaf3l, -0.7853981633974483F, -0.7853981633974483F, 0.7853981633974483F);
        this.helmLeaf1r = new RendererModel(this, 56, 14);
        this.helmLeaf1r.setRotationPoint(-4.5F, -6.0F, -2.5F);
        this.helmLeaf1r.addBox(-2.0F, -3.0F, -1.0F, 2, 3, 1, s);
        this.setRotateAngle(helmLeaf1r, -0.2617993877991494F, 0.2617993877991494F, -0.5235987755982988F);
        this.helmLeaf2r = new RendererModel(this, 56, 8);
        this.helmLeaf2r.setRotationPoint(-4.5F, -6.0F, -0.5F);
        this.helmLeaf2r.addBox(-2.0F, -5.0F, -1.0F, 2, 5, 1, s);
        this.setRotateAngle(helmLeaf2r, -0.5235987755982988F, 0.5235987755982988F, -0.7853981633974483F);
        this.helmLeaf3r = new RendererModel(this, 56, 0);
        this.helmLeaf3r.setRotationPoint(-4.5F, -6.0F, 2.5F);
        this.helmLeaf3r.addBox(-2.0F, -7.0F, -1.0F, 2, 7, 1, s);
        this.setRotateAngle(helmLeaf3r, -0.7853981633974483F, 0.7853981633974483F, -0.7853981633974483F);
        this.helmbranch1l = new RendererModel(this, 36, 15);
        this.helmbranch1l.mirror = true;
        this.helmbranch1l.setRotationPoint(2.5F, -9.0F, -3.5F);
        this.helmbranch1l.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(helmbranch1l, 0.5235987755982988F, 0.2617993877991494F, 0.0F);
        this.helmbranch2l = new RendererModel(this, 36, 15);
        this.helmbranch2l.mirror = true;
        this.helmbranch2l.setRotationPoint(4.5F, -3.0F, -2.5F);
        this.helmbranch2l.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(helmbranch2l, 0.08726646259971647F, 0.2617993877991494F, 0.0F);
        this.helmbranch1r = new RendererModel(this, 36, 15);
        this.helmbranch1r.setRotationPoint(-2.5F, -9.0F, -3.5F);
        this.helmbranch1r.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(helmbranch1r, 0.5235987755982988F, -0.2617993877991494F, 0.0F);
        this.helmbranch2r = new RendererModel(this, 36, 15);
        this.helmbranch2r.setRotationPoint(-4.5F, -3.0F, -2.5F);
        this.helmbranch2r.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(helmbranch2r, 0.08726646259971647F, -0.2617993877991494F, 0.0F);
        
        //body
        this.bodyAnchor = new RendererModel(this, 0, 0);
        this.bodyAnchor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyAnchor.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, s);
        this.bodyTop = new RendererModel(this, 0, 20);
        this.bodyTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyTop.addBox(-5.5F, 0.0F, -3.0F, 11, 6, 6, s);
        this.bodyBottom = new RendererModel(this, 0, 32);
        this.bodyBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyBottom.addBox(-4.5F, 5.0F, -2.5F, 9, 3, 5, s);
        
        //armL
        this.armLAnchor = new RendererModel(this, 0, 0);
        this.armLAnchor.mirror = true;
        this.armLAnchor.setRotationPoint(4.0F, 2.0F, 0.0F);
        this.armLAnchor.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, s);
		this.armL = new RendererModel(this, 0, 52);
        this.armL.mirror = true;
        this.armL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armL.addBox(-1.5F, 3.0F, -2.49F, 5, 8, 5, s);
        this.armLpauldron = new RendererModel(this, 0, 40);
        this.armLpauldron.mirror = true;
        this.armLpauldron.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.armLpauldron.addBox(-1.0F, -3.0F, -3.0F, 6, 6, 6, s);
        this.armLbranch1 = new RendererModel(this, 36, 15);
        this.armLbranch1.mirror = true;
        this.armLbranch1.setRotationPoint(4.0F, -3.0F, -1.0F);
        this.armLbranch1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(armLbranch1, 0.5235987755982988F, 0.5235987755982988F, 0.0F);
        this.armLbranch2 = new RendererModel(this, 36, 24);
        this.armLbranch2.mirror = true;
        this.armLbranch2.setRotationPoint(5.0F, -2.0F, 0.0F);
        this.armLbranch2.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 5, s);
        this.setRotateAngle(armLbranch2, 0.08726646259971647F, 0.7853981633974483F, 0.0F);
        
        //armR
        this.armRAnchor = new RendererModel(this, 0, 0);
        this.armRAnchor.mirror = true;
        this.armRAnchor.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.armRAnchor.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, s);
		this.armR = new RendererModel(this, 0, 52);
        this.armR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armR.addBox(-3.5F, 3.0F, -2.51F, 5, 8, 5, s);
        this.armRpauldron = new RendererModel(this, 0, 40);
        this.armRpauldron.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.armRpauldron.addBox(-5.0F, -3.0F, -3.0F, 6, 6, 6, s);
        this.armRbranch1 = new RendererModel(this, 36, 15);
        this.armRbranch1.setRotationPoint(-4.0F, -3.0F, -1.0F);
        this.armRbranch1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(armRbranch1, 0.5235987755982988F, -0.5235987755982988F, 0.0F);
        this.armRbranch2 = new RendererModel(this, 36, 24);
        this.armRbranch2.setRotationPoint(-5.0F, -2.0F, 0.0F);
        this.armRbranch2.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 5, s);
        this.setRotateAngle(armRbranch2, 0.08726646259971647F, -0.7853981633974483F, 0.0F);
       
        //pants
        this.pantsAnchor = new RendererModel(this, 0, 0);
        this.pantsAnchor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pantsAnchor.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, s);
        this.belt = new RendererModel(this, 0, 65);
        this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.belt.addBox(-4.5F, 8.0F, -3.0F, 9, 5, 6, s);
		this.legL = new RendererModel(this, 0, 76);
        this.legL.mirror = true;
        this.legL.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.legL.addBox(-2.39F, -0.01F, -2.49F, 5, 6, 5, s);
		this.legR = new RendererModel(this, 0, 76);
        this.legR.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.legR.addBox(-2.61F, -0.01F, -2.51F, 5, 6, 5, s);
        
        //boots
        this.bootL = new RendererModel(this, 0, 94);
        this.bootL.mirror = true;
        this.bootL.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.bootL.addBox(-2.39F, 8.5F, -2.49F, 5, 4, 5, s);
        this.bootLtop = new RendererModel(this, 0, 87);
        this.bootLtop.mirror = true;
        this.bootLtop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bootLtop.addBox(-2.39F, 6.0F, -2.49F, 6, 2, 5, s);
        this.bootLbranch1 = new RendererModel(this, 36, 15);
        this.bootLbranch1.mirror = true;
        this.bootLbranch1.setRotationPoint(3.5F, 6.0F, 0.0F);
        this.bootLbranch1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7,s);
        this.setRotateAngle(bootLbranch1, 0.2617993877991494F, 0.2617993877991494F, -0.08726646259971647F);
        this.bootLbranch2 = new RendererModel(this, 36, 24);
        this.bootLbranch2.mirror = true;
        this.bootLbranch2.setRotationPoint(2.5F, 9.0F, 0.0F);
        this.bootLbranch2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, s);
        this.setRotateAngle(bootLbranch2, 0.08726646259971647F, 0.7853981633974483F, 0.0F);
        this.bootR = new RendererModel(this, 0, 94);
        this.bootR.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.bootR.addBox(-2.61F, 8.5F, -2.51F, 5, 4, 5, s);
		this.bootRtop = new RendererModel(this, 0, 87);
        this.bootRtop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bootRtop.addBox(-3.61F, 6.0F, -2.51F, 6, 2, 5, s);
        this.bootRbranch1 = new RendererModel(this, 36, 15);
        this.bootRbranch1.setRotationPoint(-3.5F, 6.0F, 0.0F);
        this.bootRbranch1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, s);
        this.setRotateAngle(bootRbranch1, 0.2617993877991494F, -0.2617993877991494F, 0.08726646259971647F);
        this.bootRbranch2 = new RendererModel(this, 36, 24);
        this.bootRbranch2.setRotationPoint(-2.5F, 9.0F, 0.5F);
        this.bootRbranch2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, s);
        this.setRotateAngle(bootRbranch2, 0.08726646259971647F, -0.7853981633974483F, 0.0F);
		
        //hierarchy
        this.helmAnchor.addChild(this.helm);
        this.helm.addChild(this.helmFront);
        this.helm.addChild(this.helmLeaf1l);
        this.helm.addChild(this.helmLeaf2l);
        this.helm.addChild(this.helmLeaf3l);
        this.helm.addChild(this.helmLeaf1r);
        this.helm.addChild(this.helmLeaf2r);
        this.helm.addChild(this.helmLeaf3r);
        this.helm.addChild(this.helmbranch1l);
        this.helm.addChild(this.helmbranch2l);
        this.helm.addChild(this.helmbranch1r);
        this.helm.addChild(this.helmbranch2r);
        
        this.bodyAnchor.addChild(this.bodyTop);
        this.bodyTop.addChild(this.bodyBottom);
        this.armLAnchor.addChild(this.armL);
        this.armL.addChild(this.armLpauldron);
        this.armLpauldron.addChild(this.armLbranch1);
        this.armLpauldron.addChild(this.armLbranch2);
        this.armRAnchor.addChild(this.armR);
        this.armR.addChild(this.armRpauldron);
        this.armRpauldron.addChild(this.armRbranch1);
        this.armRpauldron.addChild(this.armRbranch2);
        
        this.pantsAnchor.addChild(this.belt);
        this.belt.addChild(this.legL);
        this.belt.addChild(this.legR);
        
        this.bootL.addChild(bootLtop);
        this.bootLtop.addChild(bootLbranch1);
        this.bootLtop.addChild(bootLbranch2);
        this.bootR.addChild(bootRtop);
        this.bootRtop.addChild(bootRbranch1);
        this.bootRtop.addChild(bootRbranch2);
	}

	@Override
	public void render(@Nonnull LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		
		helmAnchor.showModel = slot == EquipmentSlotType.HEAD;
		bodyAnchor.showModel = slot == EquipmentSlotType.CHEST;
		armLAnchor.showModel = slot == EquipmentSlotType.CHEST;
		armRAnchor.showModel = slot == EquipmentSlotType.CHEST;
		legR.showModel = slot == EquipmentSlotType.LEGS;
		legL.showModel = slot == EquipmentSlotType.LEGS;
		bootL.showModel = slot == EquipmentSlotType.FEET;
		bootR.showModel = slot == EquipmentSlotType.FEET;
		
		bipedHeadwear.showModel = false;

		bipedHead = helmAnchor;
		bipedBody = bodyAnchor;
		bipedRightArm = armRAnchor;
		bipedLeftArm = armLAnchor;
		if(slot == EquipmentSlotType.LEGS) {
			bipedBody = pantsAnchor;
			bipedRightLeg = legR;
			bipedLeftLeg = legL;
		} else {
			bipedRightLeg = bootR;
			bipedLeftLeg = bootL;
		}

		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}
}
