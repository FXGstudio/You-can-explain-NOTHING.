package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.world.Teleporter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcbbs.youcanexplainnothing.world.WorldLinnea;
import net.mcbbs.youcanexplainnothing.item.ItemNetherDimensionMedium;
import net.mcbbs.youcanexplainnothing.item.ItemLinneaDimensionMedium;
import net.mcbbs.youcanexplainnothing.item.ItemEndDimensionMedium;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Map;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureGODT extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureGODT(ElementsYouCanExplainNothingMod instance) {
		super(instance, 89);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GODT!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GODT!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GODT!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GODT!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GODT!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) >= 1)) {
			if (((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemNetherDimensionMedium.block, (int) (1))
					.getItem())) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
						int dimensionID = -1;
						class TeleporterDirect extends Teleporter {
							public TeleporterDirect(WorldServer worldserver) {
								super(worldserver);
							}

							@Override
							public void placeInPortal(Entity entity, float yawrotation) {
							}

							@Override
							public boolean placeInExistingPortal(Entity entity, float yawrotation) {
								return true;
							}

							@Override
							public boolean makePortal(Entity entity) {
								return true;
							}
						}
						EntityPlayerMP _player = (EntityPlayerMP) _ent;
						_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID,
								new TeleporterDirect(_player.getServerWorld()));
						_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
					}
				}
			}
			if (((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemEndDimensionMedium.block, (int) (1))
					.getItem())) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
						int dimensionID = 1;
						class TeleporterDirect extends Teleporter {
							public TeleporterDirect(WorldServer worldserver) {
								super(worldserver);
							}

							@Override
							public void placeInPortal(Entity entity, float yawrotation) {
							}

							@Override
							public boolean placeInExistingPortal(Entity entity, float yawrotation) {
								return true;
							}

							@Override
							public boolean makePortal(Entity entity) {
								return true;
							}
						}
						EntityPlayerMP _player = (EntityPlayerMP) _ent;
						_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID,
								new TeleporterDirect(_player.getServerWorld()));
						_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
					}
				}
			}
			if (((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemLinneaDimensionMedium.block, (int) (1))
					.getItem())) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
						int dimensionID = WorldLinnea.DIMID;
						class TeleporterDirect extends Teleporter {
							public TeleporterDirect(WorldServer worldserver) {
								super(worldserver);
							}

							@Override
							public void placeInPortal(Entity entity, float yawrotation) {
							}

							@Override
							public boolean placeInExistingPortal(Entity entity, float yawrotation) {
								return true;
							}

							@Override
							public boolean makePortal(Entity entity) {
								return true;
							}
						}
						EntityPlayerMP _player = (EntityPlayerMP) _ent;
						_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID,
								new TeleporterDirect(_player.getServerWorld()));
						_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
					}
				}
			}
		}
	}
}
