package fr.niavlys.craftcheat.trad;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.niavlys.craftcheat.CraftCheat;

public class Traductions implements CommandExecutor {
	private static HashMap<String, String> en = new HashMap<>();
	private static HashMap<String, String> fr = new HashMap<>();
	
	public static void init() {
		initFR();
		initEN();
	}

	private static void initEN() {
//		Start/Stop Plugin
		en.put("start", "["+CraftCheat.name+" "+CraftCheat.ver+"] Succefully Launched!");
		en.put("stop", "["+CraftCheat.name+" "+CraftCheat.ver+"] Succefully Shutdowned!");
		// GameModeItem
		en.put("gmitem.name", ChatColor.GOLD+"Creative Mode Cheat");
		en.put("gmitem.lore.1", ChatColor.AQUA+"This item allows you to put yourself");
		en.put("gmitem.lore.2", ChatColor.AQUA+"in creative mode for 1 Minute");
		en.put("gmitem.use", ChatColor.GREEN+"You have used your item, you are now in creative mode for 1 Minute!");
		en.put("gmitem.stop", ChatColor.RED+"The 1 Minutes have passed, you are back in Survival mode.");
		en.put("gmitem.error", ChatColor.RED+"You are already in creative mode!");
		// FlyItem
		en.put("flyitem.name", ChatColor.GOLD+"Cheat Fly");
		en.put("flyitem.lore.1", ChatColor.AQUA+"This item allows you to fly");
		en.put("flyitem.lore.2", ChatColor.AQUA+"for 10 Minutes");
		en.put("flyitem.use", ChatColor.GREEN+"You have used your item, you can now fly for 10 Minutes!");
		en.put("flyitem.stop", ChatColor.RED+"The 10 Minutes have passed, you can no longer fly.");
		en.put("flyitem.error", ChatColor.RED+"You can already fly!");
		// VanishItem
		en.put("inviitem.name", ChatColor.GOLD+"Cheat Invisibility");
		en.put("inviitem.lore.1", ChatColor.AQUA+"This item allows you");
		en.put("inviitem.lore.2", ChatColor.AQUA+"to be invisible for 3 Minutes");
		en.put("inviitem.use", ChatColor.GREEN+"You have used your item, you are now invisible for 3 Minutes!");
		en.put("inviitem.stop", ChatColor.RED+"The 3 Minutes have passed, you are visible again.");
		en.put("inviitem.error", ChatColor.RED+"You are already invisible!");
		// GodItem
		en.put("goditem.name", ChatColor.GOLD+"GodMod Cheat");
		en.put("goditem.lore.1", ChatColor.AQUA+"This item allows you to");
		en.put("goditem.lore.2", ChatColor.AQUA+"be in GodMod for 1 Minute");
		en.put("goditem.use", ChatColor.GREEN+"You have used your item, you are now in GodMod for 1 Minute!");
		en.put("goditem.stop", ChatColor.RED+"The 1 Minutes have passed, you are vulnerable again");
		en.put("goditem.error", ChatColor.RED+"You are already in GodMod!");
//		Remaining Time
		en.put("remaining.5m", ChatColor.RED+"Only 5 Minutes Left!");
		en.put("remaining.4m", ChatColor.RED+"Only 4 Minutes Left!");
		en.put("remaining.3m", ChatColor.RED+"Only 3 Minutes Left!");
		en.put("remaining.2m", ChatColor.RED+"Only 2 Minutes Left!");
		en.put("remaining.1m", ChatColor.RED+"Only 1 Minutes Left!");
		en.put("remaining.45s", ChatColor.RED+"Only 45 Seconds Left!");
		en.put("remaining.30s", ChatColor.RED+"Only 30 Seconds Left!");
		en.put("remaining.15s", ChatColor.RED+"Only 15 Seconds Left!");
		en.put("remaining.10s", ChatColor.RED+"Only 10 Seconds Left!");
		en.put("remaining.5s", ChatColor.RED+"Only 5 Seconds Left!");
		en.put("remaining.4s", ChatColor.RED+"Only 4 Seconds Left!");
		en.put("remaining.3s", ChatColor.RED+"Only 3 Seconds Left!");
		en.put("remaining.2s", ChatColor.RED+"Only 2 Seconds Left!");
		en.put("remaining.1s", ChatColor.RED+"Only 1 Second Left!");
//		CDS
		en.put("plume", "Feather");
		en.put("plastronfer", "Iron Chestplate");
		en.put("verre", "Glass");
		en.put("dblock", "Diamond Block");
	}
	
	private static void initFR() {
//		Start/Stop Plugin
		fr.put("start", "["+CraftCheat.name+" "+CraftCheat.ver+"] Lancement Reussi!");
		fr.put("stop", "["+CraftCheat.name+" "+CraftCheat.ver+"] Arret Reussi!");
//		GameMode Item
		fr.put("gmitem.name", ChatColor.GOLD+"Cheat Mode Créatif");
		fr.put("gmitem.lore.1", ChatColor.AQUA+"Cet item permet de se mettre");
		fr.put("gmitem.lore.2", ChatColor.AQUA+"en mode créatif pendant 1 Minute");
		fr.put("gmitem.use", ChatColor.GREEN+"Vous avez utilisé votre item, vous êtes mainteant en mode créatif pendant 1 Minute!");
		fr.put("gmitem.stop", ChatColor.RED+"Les 1 Minutes sont passées, vous êtes remis en mode Survie.");
		fr.put("gmitem.error", ChatColor.RED+"Vous êtes déjà en mode créatif!");
//		Fly Item
		fr.put("flyitem.name", ChatColor.GOLD+"Cheat Vol");
		fr.put("flyitem.lore.1", ChatColor.AQUA+"Cet item permet de voler");
		fr.put("flyitem.lore.2", ChatColor.AQUA+"pendant 10 Minutes");
		fr.put("flyitem.use", ChatColor.GREEN+"Vous avez utilisé votre item, vous pouvez mainteant voler pendant 10 Minutes!");
		fr.put("flyitem.stop", ChatColor.RED+"Les 10 Minutes sont passées, vous ne pouvez dorénavant plus voler.");
		fr.put("flyitem.error", ChatColor.RED+"Vous pouvez déjà voler!");
//		Vanish Item
		fr.put("inviitem.name", ChatColor.GOLD+"Cheat Invisibilité");
		fr.put("inviitem.lore.1", ChatColor.AQUA+"Cet item vous permet de vous");
		fr.put("inviitem.lore.2", ChatColor.AQUA+"rendre invisible pendant 3 Minutes");
		fr.put("inviitem.use", ChatColor.GREEN+"Vous avez utilisé votre item, vous êtes maintenant invisible pendant 3 Minutes!");
		fr.put("inviitem.stop", ChatColor.RED+"Les 3 Minutes sont passées, vous êtes de nouveau visible.");
		fr.put("inviitem.error", ChatColor.RED+"Vous êtes déjà invisible!");
//		God Item
		fr.put("goditem.name", ChatColor.GOLD+"Cheat Invincibilité");
		fr.put("goditem.lore.1", ChatColor.AQUA+"Cet item permet de vous rendre");
		fr.put("goditem.lore.2", ChatColor.AQUA+"invincible pendant 1 Minute");
		fr.put("goditem.use", ChatColor.GREEN+"Vous avez utilisé votre item, vous êtes mainteant invulnérable pendant 1 Minute!");
		fr.put("goditem.stop", ChatColor.RED+"Les 1 Minutes sont passées, vous êtes de nouveau vulnérable");
		fr.put("goditem.error", ChatColor.RED+"Vous êtes déjà Invulnérable!");
//		Remaining Time
		fr.put("remaining.5m", ChatColor.RED+"Plus que 5 Minutes Restantes!");
		fr.put("remaining.4m", ChatColor.RED+"Plus que 4 Minutes Restantes!");
		fr.put("remaining.3m", ChatColor.RED+"Plus que 3 Minutes Restantes!");
		fr.put("remaining.2m", ChatColor.RED+"Plus que 2 Minutes Restantes!");
		fr.put("remaining.1m", ChatColor.RED+"Plus que 1 Minutes Restantes!");
		fr.put("remaining.45s", ChatColor.RED+"Plus que 45 Secondes Restantes!");
		fr.put("remaining.30s", ChatColor.RED+"Plus que 30 Secondes Restantes!");
		fr.put("remaining.15s", ChatColor.RED+"Plus que 15 Secondes Restantes!");
		fr.put("remaining.10s", ChatColor.RED+"Plus que 10 Secondes Restantes!");
		fr.put("remaining.5s", ChatColor.RED+"Plus que 5 Secondes Restantes!");
		fr.put("remaining.4s", ChatColor.RED+"Plus que 4 Secondes Restantes!");
		fr.put("remaining.3s", ChatColor.RED+"Plus que 3 Secondes Restantes!");
		fr.put("remaining.2s", ChatColor.RED+"Plus que 2 Secondes Restantes!");
		fr.put("remaining.1s", ChatColor.RED+"Plus que 1 Seconde Restantes!");
//		CDS
		fr.put("plume", "Plume");
		fr.put("plastronfer", "Plastron en Fer");
		fr.put("verre", "Verre");
		fr.put("dblock", "Bloc de Diamant");
	}
	
	public static String getTrad(String key) {
		String lang = CraftCheat.lang;
		
		if(lang.equalsIgnoreCase("en")) {
			return en.get(key);
		}
		else {
			return fr.get(key);
		}
	}

//	TODO
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String msg, String[] args) {
		return false;
	}
}
