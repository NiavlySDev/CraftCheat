package fr.niavlys.craftcheat.gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.niavlys.api.NvApi;
import fr.niavlys.craftcheat.CraftCheat;
import fr.niavlys.craftcheat.items.Items;
import fr.niavlys.craftcheat.trad.Traductions;

public class GUI {
	
	public static HashMap<String, Inventory> guis = new HashMap<>();
	public static List<String> guisKeys = new ArrayList<>();

	public static void init() {
		initRecipeCDS();
	}

	private static void initRecipeCDS() {
		createRecipeCDS(Material.FEATHER, Traductions.getTrad("plume"), "plume");
	}

	private static void createRecipeCDS(Material mat, String name, String key) {
		String namegui;
		if(CraftCheat.lang.equalsIgnoreCase("fr")) {
			namegui = "Recette: "+name+" Compact";
		}
		else {
			namegui = "Recipe: Compact "+name;
		}
		Inventory guicompact = Bukkit.createInventory(null, 5*9-1, namegui);
		NvApi.fonctions.si(guicompact, 5*9);
		guicompact.setItem(12, new ItemStack(mat));
		guicompact.setItem(13, new ItemStack(mat));
		guicompact.setItem(14, new ItemStack(mat));
		guicompact.setItem(21, new ItemStack(mat));
		guicompact.setItem(22, new ItemStack(mat));
		guicompact.setItem(23, new ItemStack(mat));
		guicompact.setItem(25, Items.items.get(key+"_compact"));
		guicompact.setItem(30, new ItemStack(mat));
		guicompact.setItem(31, new ItemStack(mat));
		guicompact.setItem(32, new ItemStack(mat));
		guis.put(key+".compact.recipe", guicompact);
		guisKeys.add(key+".compact.recipe");

		if(CraftCheat.lang.equalsIgnoreCase("fr")) {
			namegui = "Recette: "+name+" Deluxe";
		}
		else {
			namegui = "Recipe: Deluxe "+name;
		}
		
		Inventory guideluxe = Bukkit.createInventory(null, 5*9-1, namegui);
		NvApi.fonctions.si(guideluxe, 5*9);
		guideluxe.setItem(12, new ItemStack(mat));
		guideluxe.setItem(13, new ItemStack(mat));
		guideluxe.setItem(14, new ItemStack(mat));
		guideluxe.setItem(21, new ItemStack(mat));
		guideluxe.setItem(22, new ItemStack(mat));
		guideluxe.setItem(23, new ItemStack(mat));
		guideluxe.setItem(25, Items.items.get(key+"_suprem"));
		guideluxe.setItem(30, new ItemStack(mat));
		guideluxe.setItem(31, new ItemStack(mat));
		guideluxe.setItem(32, new ItemStack(mat));
		guis.put(key+".deluxe.recipe", guideluxe);
		guisKeys.add(key+".deluxe.recipe");

		if(CraftCheat.lang.equalsIgnoreCase("fr")) {
			namegui = "Recette: "+name+" Supreme";
		}
		else {
			namegui = "Recipe: Supreme "+name;
		}
		
		Inventory guisuprem = Bukkit.createInventory(null, 5*9-1, namegui);
		NvApi.fonctions.si(guisuprem, 5*9);
		guisuprem.setItem(12, new ItemStack(mat));
		guisuprem.setItem(13, new ItemStack(mat));
		guisuprem.setItem(14, new ItemStack(mat));
		guisuprem.setItem(21, new ItemStack(mat));
		guisuprem.setItem(22, new ItemStack(mat));
		guisuprem.setItem(23, new ItemStack(mat));
		guisuprem.setItem(25, Items.items.get(key+"_supreme"));
		guisuprem.setItem(30, new ItemStack(mat));
		guisuprem.setItem(31, new ItemStack(mat));
		guisuprem.setItem(32, new ItemStack(mat));
		guis.put(key+".suprem.recipe", guisuprem);
		guisKeys.add(key+".suprem.recipe");
	}
}
