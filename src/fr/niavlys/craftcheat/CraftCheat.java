package fr.niavlys.craftcheat;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import fr.niavlys.craftcheat.gui.GUI;
import fr.niavlys.craftcheat.gui.Recipes;
import fr.niavlys.craftcheat.items.Items;
import fr.niavlys.craftcheat.listener.ccListener;
import fr.niavlys.craftcheat.trad.Traductions;

public class CraftCheat extends JavaPlugin {
	
	public static String name = "CraftCheat";
	public static String ver = "v2.0";
	public static String lang;
	
	public void onEnable() {
		
		File config = new File("plugins/CraftCheat/config.yml");
		
		if(!config.exists()) {
			saveDefaultConfig();
		}
		lang = getConfig().getString("lang");
		
		Traductions.init();
		
		Bukkit.resetRecipes();
		
		Items.init();
		
		GUI.init();
		
		getCommand("debug").setExecutor(this);
		getCommand("test").setExecutor(this);
		getCommand("reset").setExecutor(this);
		getCommand("recipes").setExecutor(new Recipes());
//		getCommand("setlang").setExecutor(new Traductions());
		
		for(Player p : Bukkit.getOnlinePlayers()) {
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "recipe give "+p.getName()+" *");
		}
		
		getServer().getPluginManager().registerEvents(new ccListener(), this);
		
		System.out.println(Traductions.getTrad("start"));
	}
	
	public void onDisable() {
		System.out.println(Traductions.getTrad("stop"));
	}
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String msg, String[] args) {
		Player p;
		if(s instanceof Player) p = (Player) s;
		else return false;
		if(cmd.getName().equalsIgnoreCase("debug")) {
			for(ItemStack item : Items.itemsList) {
				Bukkit.getWorld("world").dropItem(p.getLocation(), item);
			}
		}
		else if(cmd.getName().equalsIgnoreCase("test")) {
		}
		else {
			p.setGameMode(GameMode.SURVIVAL);
			p.setAllowFlight(false);
			p.setInvisible(false);
			p.setInvulnerable(false);
			p.setGameMode(GameMode.CREATIVE);
		}
		return false;
	}
	
	public void myClickEvent(InventoryClickEvent e) {
		e.getWhoClicked().sendMessage("test");
	}
}
