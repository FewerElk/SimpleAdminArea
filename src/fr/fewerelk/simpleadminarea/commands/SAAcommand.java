package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SAAcommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
          sender.sendMessage(ChatColor.GREEN + "---SAA HELP---\n/saa create <area> : create a new area.");
        } else {
            Bukkit.getLogger().info(ChatColor.GREEN + "---SAA HELP---\n/saa create <area> : create a new area.");
        }
        return true;
    }
}
