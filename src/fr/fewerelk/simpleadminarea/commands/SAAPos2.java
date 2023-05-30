package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;

import fr.fewerelk.simpleadminarea.commands.exceptions.ConsoleError;
import fr.fewerelk.simpleadminarea.commands.exceptions.PermError;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SAAPos2 implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if ((sender instanceof Player) && (sender.hasPermission("saa.pos2"))) {
            String path = "plugin/SAA/";

            Location pos = Bukkit.getPlayer(sender.getName()).getLocation();

            File areafile = new File(path + args[0]);
            try {
                PrintStream out = new PrintStream(areafile);
                out.println("2");
                out.println(pos.getWorld());
                out.println(pos.getX());
                out.println(pos.getY());
                out.println(pos.getZ());
                out.close();
                sender.sendMessage(ChatColor.GREEN + "Succes !");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            return true;
        } else {
            if (sender instanceof Player) {
                PermError error = new PermError();
                error.permerror(Bukkit.getServer().getPlayer(sender.getName()));
            } else {
                ConsoleError error = new ConsoleError();
                error.consoleError();
            }
            return false;
        }
    }
    
}
