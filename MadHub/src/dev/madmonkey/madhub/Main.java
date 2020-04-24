package dev.madmonkey.madhub;

import dev.madmonkey.madhub.Commands.SetLobby;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;

    public void onEnable(){
        instance=this;
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
        Bukkit.getConsoleSender().sendMessage("MadHub made by MadMonkey");
        Bukkit.getConsoleSender().sendMessage("Version: 1.0");
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
        getCommand("setlobby").setExecutor(new SetLobby());
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
        Bukkit.getConsoleSender().sendMessage("MadHub made by MadMonkey");
        Bukkit.getConsoleSender().sendMessage("Version: 1.0");
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public static Main getInstance(){
        return instance;
    }
}
