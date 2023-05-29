package fr.fewerelk.simpleadminarea;

import org.bukkit.plugin.java.JavaPlugin;

import fr.fewerelk.simpleadminarea.commands.*;

import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

public class SAA extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info(ChatColor.GREEN + "Hello ! SAA is a spigot plugin created by FewerElk ! Thank for usage. Enabling SimpleAdminArea...");
        this.getCommand("saa").setExecutor(new SAAcommand());
        this.getCommand("saa create").setExecutor(new SAACreate());
        this.getCommand("saa pos1").setExecutor(new SAAPos1());
        //continue to enable
    }

    @Override
    public void onDisable() {
        //disable
        Bukkit.getLogger().info(ChatColor.RED + "SAA was disabled. Thank you for usage and see you soon !");
    }

}
