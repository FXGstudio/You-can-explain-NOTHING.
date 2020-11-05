package net.mcbbs.youcanexplainnothing.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

import java.util.Map;
import java.util.HashMap;

@YouCanExplainNothingModElements.ModElement.Tag
public class GOCOMMANDProcedure extends YouCanExplainNothingModElements.ModElement {
	public GOCOMMANDProcedure(YouCanExplainNothingModElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure GOCOMMAND!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				System.err.println("Failed to load dependency guistate for procedure GOCOMMAND!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						(new Object() {
							public String getText() {
								TextFieldWidget textField = (TextFieldWidget) guistate.get("text:command");
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
