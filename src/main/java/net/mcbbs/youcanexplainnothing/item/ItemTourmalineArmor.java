
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemTourmalineArmor extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:tourmaline_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("you_can_explain_nothing:tourmaline_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("you_can_explain_nothing:tourmaline_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("you_can_explain_nothing:tourmaline_armorboots")
	public static final Item boots = null;
	public ItemTourmalineArmor(ElementsYouCanExplainNothingMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TOURMALINE_ARMOR", "you_can_explain_nothing:tourmaline", 15,
				new int[]{2, 6, 5, 2}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("tourmaline_armorhelmet")
				.setRegistryName("tourmaline_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("tourmaline_armorbody")
				.setRegistryName("tourmaline_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("tourmaline_armorlegs")
				.setRegistryName("tourmaline_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("tourmaline_armorboots")
				.setRegistryName("tourmaline_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("you_can_explain_nothing:tourmaline_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("you_can_explain_nothing:tourmaline_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("you_can_explain_nothing:tourmaline_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("you_can_explain_nothing:tourmaline_armorboots", "inventory"));
	}
}
