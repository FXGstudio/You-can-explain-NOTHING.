package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemZincIngot;
import net.mcbbs.youcanexplainnothing.item.ItemZincDust;
import net.mcbbs.youcanexplainnothing.item.ItemTinIngot;
import net.mcbbs.youcanexplainnothing.item.ItemTinDust;
import net.mcbbs.youcanexplainnothing.item.ItemCopperIngot;
import net.mcbbs.youcanexplainnothing.item.ItemCopperDust;
import net.mcbbs.youcanexplainnothing.item.ItemAntimonyNugget;
import net.mcbbs.youcanexplainnothing.item.ItemAntimonyDust;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Map;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureGrinderSimpleUpdateTick extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureGrinderSimpleUpdateTick(ElementsYouCanExplainNothingMod instance) {
		super(instance, 205);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GrinderSimpleUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GrinderSimpleUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GrinderSimpleUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GrinderSimpleUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public int getAmount(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot) {
					ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) >= 1)) {
			if ((new ItemStack(ItemCopperIngot.block, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (4), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemCopperDust.block, (int) (1));
							_setstack.setCount(2);
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
				}
			}
			if ((new ItemStack(ItemTinIngot.block, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (4), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemTinDust.block, (int) (1));
							_setstack.setCount(2);
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
				}
			}
			if ((new ItemStack(ItemZincIngot.block, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (4), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemZincDust.block, (int) (1));
							_setstack.setCount(2);
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
				}
			}
			if ((new ItemStack(ItemAntimonyNugget.block, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (4), (int) (1));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemAntimonyDust.block, (int) (1));
							_setstack.setCount(1);
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
				}
			}
		}
	}
}
