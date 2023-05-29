package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class SAACreate implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            //next
            return true;
        } else {
            Bukkit.getLogger().warning(ChatColor.RED + "ACCES DENIED : you must be a player to use this command.");
            return false;
        }
    }
    
}
