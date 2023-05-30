package fr.fewerelk.simpleadminarea.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import fr.fewerelk.simpleadminarea.commands.exceptions.ConsoleError;
import fr.fewerelk.simpleadminarea.commands.exceptions.PermError;


public class SAACreate implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if ((sender instanceof Player) && (sender.hasPermission("saa.create"))) {
            String path = "plugins/SAA/";

            File areafile = new File(path + args[0]);
            try {
                areafile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            try {
                PrintStream out = new PrintStream(areafile);
                out.println(args[0]);
                out.close();
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
