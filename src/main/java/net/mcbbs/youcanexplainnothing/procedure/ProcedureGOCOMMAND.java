package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;
import net.minecraft.client.gui.GuiTextField;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Map;
import java.util.HashMap;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureGOCOMMAND extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureGOCOMMAND(ElementsYouCanExplainNothingMod instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GOCOMMAND!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure GOCOMMAND!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, (new Object() {
					public String getText() {
						GuiTextField textField = (GuiTextField) guistate.get("text:command");
						if (textField != null) {
							return textField.getText();
						}
						return "";
					}
				}.getText()));
			}
		}
	}
}
