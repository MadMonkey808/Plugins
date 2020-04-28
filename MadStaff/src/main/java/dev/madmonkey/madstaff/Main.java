package dev.madmonkey.madstaff;

import dev.madmonkey.madstaff.Commands.StaffChatCommand;
import dev.madmonkey.madstaff.Listener.WorldeditAlert;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends Plugin {

    public static List<ProxiedPlayer> inSc = new ArrayList<>();

    public void onEnable(){
        getProxy().getPluginManager().registerCommand(this, new StaffChatCommand());
        getProxy().getPluginManager().registerListener(this, new WorldeditAlert());
        getLogger().info("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        getLogger().info("MadStaff made by MadMonkey");
        getLogger().info("Version: 1.2.1");
        getLogger().info("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }

    @Override
    public void onDisable() {
        getLogger().info("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        getLogger().info("MadStaff made by MadMonkey");
        getLogger().info("Version: 1.2.1");
        getLogger().info("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
