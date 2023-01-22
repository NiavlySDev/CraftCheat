package fr.niavlys.craftcheat.listener;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import fr.niavlys.craftcheat.CraftCheat;
import fr.niavlys.craftcheat.chrono.FlyItem;
import fr.niavlys.craftcheat.chrono.GMItem;
import fr.niavlys.craftcheat.chrono.GodItem;
import fr.niavlys.craftcheat.chrono.VanishTimer;
import fr.niavlys.craftcheat.items.Items;
import fr.niavlys.craftcheat.trad.Traductions;

public class ccListener implements Listener {
	@EventHandler
	public void onInterract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if(p.getInventory().getItemInMainHand() == null) {
				return;
			}
			ItemStack iteminhand = p.getInventory().getItemInMainHand();
			if(!Items.itemsList.contains(iteminhand)) return;
			if(iteminhand.equals(Items.items.get("gmitem"))){
				if(p.getGameMode().equals(GameMode.CREATIVE)) {
					p.sendMessage(Traductions.getTrad("gmitem.error"));
					return;
				}
				p.setGameMode(GameMode.CREATIVE);
				GMItem timer = new GMItem(p);
				timer.runTaskTimer(Bukkit.getPluginManager().getPlugin(CraftCheat.name), 0, 20);
				p.sendMessage(Traductions.getTrad("gmitem.use"));
			}
			if(iteminhand.equals(Items.items.get("inviitem"))) {
				if(p.isInvisible() == true) {
					p.sendMessage(Traductions.getTrad("inviitem.error"));
					return;
				}
				p.setInvisible(true);
				VanishTimer timer = new VanishTimer(p);
				timer.runTaskTimer(Bukkit.getPluginManager().getPlugin(CraftCheat.name), 0, 20);
				p.sendMessage(Traductions.getTrad("inviitem.use"));
			}
			if(iteminhand.equals(Items.items.get("goditem"))){
				if(p.isInvulnerable() == true) {
					p.sendMessage(Traductions.getTrad("goditem.error"));
					return;
				}
				p.setInvulnerable(true);
				GodItem timer = new GodItem(p);
				timer.runTaskTimer(Bukkit.getPluginManager().getPlugin(CraftCheat.name), 0, 20);
				p.sendMessage(Traductions.getTrad("goditem.use"));
			}
			if(iteminhand.equals(Items.items.get("flyitem"))) {
				if(p.getAllowFlight() == true) {
					p.sendMessage(Traductions.getTrad("flyitem.error"));
					return;
				}
				p.setAllowFlight(true);
				FlyItem timer = new FlyItem(p);
				timer.runTaskTimer(Bukkit.getPluginManager().getPlugin(CraftCheat.name), 0, 20);
				p.sendMessage(Traductions.getTrad("flyitem.use"));
				
			}
			p.getInventory().setItemInMainHand(null);
		}
	}
}
