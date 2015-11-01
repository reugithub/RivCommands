package me.rivwhall05.RivCommands.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCommands.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class settabname
  implements CommandExecutor
{
  public Main plugin;
  
	public boolean onCommand(CommandSender sender, Command command, String cmd,
			String[] args) {
		if (cmd.equalsIgnoreCase("settabname")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("For players only.. k.");

			} else {
				Player p = (Player) sender;
				if (!p.hasPermission("rivcore.settabname")) {
					p.sendMessage(ChatColor.DARK_RED
							+ "You do not have access to that command!");

				} else if (args.length == 0) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cRivCommands &8| &cPlease type in some text to set your tab name! " + message(args)));
				} else {
					p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', message(args)));
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cRivCommands &8| &aSuccessfully &cset your tab name to " + message(args)));
				}

			}
		}
		return false;
	}
	public String message(String[] args) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
		builder.append(args[i]);
		builder.append(" ");
		}
		return builder.toString().trim();
	}
}
