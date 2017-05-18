package nl.jetseverschuren.guildwars;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Guildwars extends JavaPlugin {
	
	PluginDescriptionFile pdfFile = getDescription();
	Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		logger.info(pdfFile.getName() + " has been enabled (V." + pdfFile.getVersion() + ")");
	}
	
	public void onDisable(){
		logger.info(pdfFile.getName() + " has been disabled (V." + pdfFile.getVersion() + ")");
	}
}
