package fr.niavlys.craftcheat.chrono;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import fr.niavlys.craftcheat.trad.Traductions;

public class VanishTimer extends BukkitRunnable{

	private int timer = 3*60;
	private Player p;
	
	public VanishTimer(Player p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		if(timer == 2*60) {
			p.sendMessage(Traductions.getTrad("remaining.2m"));
		}
		if(timer == 60) {
			p.sendMessage(Traductions.getTrad("remaining.1m"));
		}
		if(timer == 30) {
			p.sendMessage(Traductions.getTrad("remaining.30s"));
		}
		if(timer == 15) {
			p.sendMessage(Traductions.getTrad("remaining.15s"));
		}
		if(timer == 10) {
			p.sendMessage(Traductions.getTrad("remaining.10s"));
		}
		if(timer == 5) {
			p.sendMessage(Traductions.getTrad("remaining.5s"));
		}
		if(timer == 4) {
			p.sendMessage(Traductions.getTrad("remaining.4s"));
		}
		if(timer == 3) {
			p.sendMessage(Traductions.getTrad("remaining.3s"));
		}
		if(timer == 2) {
			p.sendMessage(Traductions.getTrad("remaining.2s"));
		}
		if(timer == 1) {
			p.sendMessage(Traductions.getTrad("remaining.1s"));
		}
		if(timer == 0) {
			p.sendMessage(Traductions.getTrad("inviitem.stop"));
			p.setFlying(false);
			p.setAllowFlight(false);
		}
		
		timer--;
	}

}
