package fr.niavlys.craftcheat.gui;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Recipes implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String msg, String[] args) {
		Player p;
		if(s instanceof Player) p =(Player) s;
		else return false;
		if(args.length == 2) {
		}
		return false;
	}

}
