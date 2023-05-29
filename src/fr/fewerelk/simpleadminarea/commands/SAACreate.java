package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import fr.fewerelk.simpleadminarea.commands.exceptions.ConsoleError;


public class SAACreate implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            //next
            return true;
        } else {
            ConsoleError error = new ConsoleError();
            error.consoleError();
            return false;
        }
    }
    
}
