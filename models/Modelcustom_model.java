// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Modelcustom_model() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.7F, -12.0F, 0.0F, 1, 7, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -6.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.4F, -6.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.4F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3054F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3054F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, -14.0F, -1.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0873F, 0.6981F, 0.9599F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -3.0F, -2.0F, -1.0F, 4, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.cube_r4.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.cube_r5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.cube_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cube_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.cube_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.cube_r3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}