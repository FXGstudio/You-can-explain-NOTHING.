
package net.mcbbs.youcanexplainnothing.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Random;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class BlockEthyne extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:ethyne")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("you_can_explain_nothing:ethyne")
	public static final Item item = null;
	private Fluid fluid;
	public BlockEthyne(ElementsYouCanExplainNothingMod instance) {
		super(instance, 288);
		fluid = new Fluid("ethyne", new ResourceLocation("you_can_explain_nothing:blocks/calciumcarbide_ore_block"),
				new ResourceLocation("you_can_explain_nothing:blocks/calciumcarbide_ore_block")).setLuminosity(1).setDensity(1).setViscosity(100)
						.setGaseous(true);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, Material.WATER) {
		}.setUnlocalizedName("ethyne").setRegistryName("ethyne"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("ethyne"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("you_can_explain_nothing:ethyne", "ethyne");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("you_can_explain_nothing:ethyne", "ethyne");
			}
		});
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 1)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		int i = chunkX + random.nextInt(16) + 8;
		int j = random.nextInt(256);
		int k = chunkZ + random.nextInt(16) + 8;
		new WorldGenLakes(block).generate(world, random, new BlockPos(i, j, k));
	}
}
