package me.rivwhall05.RivCommands.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCommands.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class resettabname
  implements CommandExecutor
{
  public Main plugin;
  
  public boolean onCommand(CommandSender sender, Command resettabname, String s, String[] args3)
  {
    Player p = (Player)sender;
	String name = p.getName();
    if (resettabname.getName().equalsIgnoreCase("resettabname")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("[RivCommands] Only players can use that command.");
      }
      else
      {
        p.setPlayerListName(p.getName());
        
      }
    }
    return false;
  }
}
