package me.rivwhall05.RivCommands.commands;

import me.rivwhall05.RivCommands.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ant
  implements CommandExecutor
{
  public Main plugin;
  
	public boolean onCommand(CommandSender sender, Command ant, String commandLabel, String[] args) {
  {
    Player p = (Player)sender;
    if (ant.getName().equalsIgnoreCase("ant")) {
  	  if(sender == Bukkit.getServer().getPlayer("Antasma_X")){
    	  if (args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Please specify a player!");
			return true;
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null) {
			sender.sendMessage(ChatColor.RED + "Could not find player " + args[0] + "!");
			return true;
		}
		Bukkit.getServer().broadcastMessage(ChatColor.RED + sender.getName() + ChatColor.RED + " -" + ChatColor.RED + " Overflooding " + ChatColor.DARK_RED + target.getName() + ChatColor.RED + " with ants!"); 
        // GIVE NAUSEA
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "effect " + target.getName() + " 9 180 255");
		
    }
    else{
    	sender.sendMessage(ChatColor.RED + "RivCommands " + ChatColor.DARK_GRAY + "| " + ChatColor.AQUA + "You Dont Have Permission For This Command Sorry!");
    }
  }
return false;
	}
}
}