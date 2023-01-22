package fr.niavlys.craftcheat.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.ExactChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import fr.niavlys.craftcheat.CraftCheat;
import fr.niavlys.craftcheat.trad.Traductions;

public class Items {
	public static HashMap<String, ItemStack> items = new HashMap<>();
	public static List<ItemStack> itemsList = new ArrayList<>();
	public static List<String> itemsName = new ArrayList<>();
	
	public static void init() {
		initCDS();
		initGM();
		initFly();
		initVanish();
		initGodMod();
	}

	private static void initCDS() {
		createCDS(Material.FEATHER, Traductions.getTrad("plume"), "plume");
		createCDS(Material.IRON_CHESTPLATE, Traductions.getTrad("plastronfer"), "plastronfer");
		createCDS(Material.GLASS, Traductions.getTrad("verre"), "verre");
		createCDS(Material.DIAMOND_BLOCK, Traductions.getTrad("dblock"), "dblock");
	}

	private static void createCDS(Material mat, String name, String keyname) {
//		Compact
		String key = keyname+"_compact";
		ItemStack compact = new ItemStack(mat);
		ItemMeta compactm = compact.getItemMeta();
		String dname;
		if(CraftCheat.lang == "fr") {
			dname = name+" Compacte";
		}
		else {
			dname = "Compact "+name;
		}
		compactm.setDisplayName(dname);
		compactm.addEnchant(Enchantment.DURABILITY, 1, false);
		for(ItemFlag itmf : ItemFlag.values()) {
			compactm.addItemFlags(itmf);
		}
		compact.setItemMeta(compactm);
		items.put(key, compact);
		itemsList.add(compact);
		itemsName.add(dname);
		
		NamespacedKey compactkey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), key+"_recipe");
		System.out.println(key+"_recipe");
		ShapedRecipe compactr = new ShapedRecipe(compactkey, compact);
		compactr.shape("***","***","***");
		compactr.setIngredient('*', mat);
		Bukkit.addRecipe(compactr);
		
//		Deluxe
		key = keyname+"_deluxe";
		ItemStack deluxe = new ItemStack(mat);
		ItemMeta deluxem = deluxe.getItemMeta();
		if(CraftCheat.lang.equalsIgnoreCase("fr")) {
			dname = name+" Deluxe";
		}
		else {
			dname = "Deluxe "+name;
		}
		deluxem.setDisplayName(dname);
		deluxem.addEnchant(Enchantment.DURABILITY, 1, false);
		for(ItemFlag itmf : ItemFlag.values()) {
			deluxem.addItemFlags(itmf);
		}
		deluxe.setItemMeta(deluxem);
		items.put(key, deluxe);
		itemsList.add(deluxe);
		itemsName.add(dname);
		
		NamespacedKey deluxekey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), key+"_recipe");
		System.out.println(key+"_recipe");
		ShapedRecipe deluxer = new ShapedRecipe(deluxekey, deluxe);
		deluxer.shape("***","***","***");
		deluxer.setIngredient('*', new ExactChoice(compact));
		Bukkit.addRecipe(deluxer);
		
//		Supreme
		key = keyname+"_suprem";
		ItemStack suprem = new ItemStack(mat);
		ItemMeta supremm = suprem.getItemMeta();
		if(CraftCheat.lang.equalsIgnoreCase("fr")) {
			dname = name+" Supreme";
		}
		else {
			dname = "Suprem "+name;
		}
		supremm.setDisplayName(dname);
		supremm.addEnchant(Enchantment.DURABILITY, 1, false);
		for(ItemFlag itmf : ItemFlag.values()) {
			supremm.addItemFlags(itmf);
		}
		suprem.setItemMeta(supremm);
		items.put(key, suprem);
		itemsList.add(suprem);
		itemsName.add(dname);
		
		NamespacedKey supremkey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), key+"_recipe");
		System.out.println(key+"_recipe");
		ShapedRecipe supremr = new ShapedRecipe(supremkey, suprem);
		supremr.shape("***","***","***");
		supremr.setIngredient('*', new ExactChoice(deluxe));
		Bukkit.addRecipe(supremr);
	}

	private static void initGodMod() {
//		GodMod Item
		ItemStack god = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta godm = god.getItemMeta();
		for(ItemFlag itmf : ItemFlag.values()) {
			godm.addItemFlags(itmf);
		}
		godm.setDisplayName(ChatColor.GOLD+Traductions.getTrad("goditem.name"));
		godm.setLore(Arrays.asList(ChatColor.AQUA+Traductions.getTrad("goditem.lore.1"), ChatColor.AQUA+Traductions.getTrad("goditem.lore.2")));
		godm.addEnchant(Enchantment.DURABILITY, 1, false);
		god.setItemMeta(godm);
		items.put("goditem", god);
		itemsList.add(god);
		itemsName.add(Traductions.getTrad("goditem.name"));
		
		NamespacedKey godkey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), "goditem_recipe");
		System.out.println("goditem_recipe");
		ShapedRecipe godr = new ShapedRecipe(godkey, god);
		godr.shape("***","***","***");
		godr.setIngredient('*', new ExactChoice(items.get("plastronfer_suprem")));
		Bukkit.addRecipe(godr);
	}

	private static void initVanish() {
//		Vanish Item
		ItemStack invi = new ItemStack(Material.GLASS);
		ItemMeta invim = invi.getItemMeta();
		for(ItemFlag itmf : ItemFlag.values()) {
			invim.addItemFlags(itmf);
		}
		invim.setDisplayName(ChatColor.GOLD+Traductions.getTrad("inviitem.name"));
		invim.setLore(Arrays.asList(ChatColor.AQUA+Traductions.getTrad("inviitem.lore.1"), ChatColor.AQUA+Traductions.getTrad("inviitem.lore.2")));
		invim.addEnchant(Enchantment.DURABILITY, 1, false);
		invi.setItemMeta(invim);
		items.put("inviitem", invi);
		itemsList.add(invi);
		itemsName.add(Traductions.getTrad("inviitem.name"));
		
		NamespacedKey invikey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), "inviitem_recipe");
		System.out.println("inviitem_recipe");
		ShapedRecipe invir = new ShapedRecipe(invikey, invi);
		invir.shape("***","***","***");
		invir.setIngredient('*', new ExactChoice(items.get("verre_suprem")));
		Bukkit.addRecipe(invir);
	}

	private static void initFly() {
//		Fly Item
		ItemStack fly = new ItemStack(Material.FEATHER);
		ItemMeta flym = fly.getItemMeta();
		for(ItemFlag itmf : ItemFlag.values()) {
			flym.addItemFlags(itmf);
		}
		flym.setDisplayName(ChatColor.GOLD+Traductions.getTrad("flyitem.name"));
		flym.setLore(Arrays.asList(ChatColor.AQUA+Traductions.getTrad("flyitem.lore.1"), ChatColor.AQUA+Traductions.getTrad("flyitem.lore.2")));
		flym.addEnchant(Enchantment.DURABILITY, 1, false);
		fly.setItemMeta(flym);
		items.put("flyitem", fly);
		itemsList.add(fly);
		itemsName.add(Traductions.getTrad("flyitem.name"));
		
		NamespacedKey flykey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), "flyitem_recipe");
		System.out.println("flyitem_recipe");
		ShapedRecipe flyr = new ShapedRecipe(flykey, fly);
		flyr.shape("***","***","***");
		flyr.setIngredient('*', new ExactChoice(items.get("plume_suprem")));
		Bukkit.addRecipe(flyr);
	}

	private static void initGM() {
//		GameMode Item
		ItemStack gm = new ItemStack(Material.COMMAND_BLOCK);
		ItemMeta gmm = gm.getItemMeta();
		for(ItemFlag itmf : ItemFlag.values()) {
			gmm.addItemFlags(itmf);
		}
		gmm.setDisplayName(ChatColor.GOLD+Traductions.getTrad("gmitem.name"));
		gmm.setLore(Arrays.asList(ChatColor.AQUA+Traductions.getTrad("gmitem.lore.1"),ChatColor.AQUA+Traductions.getTrad("gmitem.lore.2")));
		gmm.addEnchant(Enchantment.DURABILITY, 1, false);
		gm.setItemMeta(gmm);
		items.put("gmitem", gm);
		itemsList.add(gm);	
		itemsName.add(Traductions.getTrad("gmitem.name"));
		
		NamespacedKey gmkey = new NamespacedKey(Bukkit.getPluginManager().getPlugin(CraftCheat.name), "gm_recipe");
		System.out.println("gm_recipe");
		ShapedRecipe gmr = new ShapedRecipe(gmkey, gm);
		gmr.shape("***","***","***");
		gmr.setIngredient('*', new ExactChoice(items.get("dblock_suprem")));
		
		Bukkit.addRecipe(gmr);
		
	}
}
