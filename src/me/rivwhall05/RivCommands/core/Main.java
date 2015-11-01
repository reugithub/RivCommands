package me.rivwhall05.RivCommands.core;

import java.util.logging.Logger;





import me.rivwhall05.RivCommands.commands.ant;
import me.rivwhall05.RivCommands.commands.rubify;
import me.rivwhall05.RivCommands.commands.settabname;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public final Logger logger = Logger.getLogger("Minecraft");
  public Main plugin;
  
  public void onEnable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    this.logger.info("RivCommands Plugin has been enabled!");
    getCommand("ant").setExecutor(new ant());
    getCommand("rubify").setExecutor(new rubify());
    getCommand("settabname").setExecutor(new settabname());;
  }
  
  public void onDisable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    this.logger.info("RivCommands Plugin has been disabled!");
  }
}
