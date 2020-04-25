package dev.madmonkey.madhub;

import dev.madmonkey.madhub.Commands.SetLobby;
import dev.madmonkey.madhub.Database.MySQL;
import org.apache.commons.dbcp2.BasicDataSource;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;
    private BasicDataSource connectionPool;
    private MySQL mysql;

    public static Main getInstance() {
        return instance;
    }

    public void onEnable(){
        instance=this;

        new SetLobby(this);

        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
        Bukkit.getConsoleSender().sendMessage("MadHub made by MadMonkey");
        Bukkit.getConsoleSender().sendMessage("Version: 1.0");
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        instance = this;
        initConnection();
    }

    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
        Bukkit.getConsoleSender().sendMessage("MadHub made by MadMonkey");
        Bukkit.getConsoleSender().sendMessage("Version: 1.0");
        Bukkit.getConsoleSender().sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void initConnection(){

        connectionPool = new BasicDataSource();
        connectionPool.setDriverClassName("com.mysql.jdbc.Driver");
        connectionPool.setUsername("root");
        connectionPool.setPassword("");
        connectionPool.setUrl("jdbc:mysql://localhost:3306/madhub?autoReconnect=true");
        connectionPool.setInitialSize(1);
        connectionPool.setMaxTotal(10);
        mysql = new MySQL(connectionPool);
    }

}
