import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import net.md_5.bungee.api.*;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
public class LobbyCommandPlus extends Plugin{

    public void onEnable(){
        
        getLogger().info(ChatColor.translateAlternateColorCodes('&', "&cLobbyCommand has been enabled"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Comando());
        
    }
    
    public void loadConfig() {

        try {
            Configuration configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(getDataFolder(), "config.yml"));
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    public void saveConfig() {
        try {
            Configuration configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(getDataFolder(), "config.yml"));
        } catch (IOException e) {

            e.printStackTrace();
        }
        Configuration configuration = null;
        try {
            configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(getDataFolder(), "config.yml"));
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(configuration, new File(getDataFolder(), "config.yml"));
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void saveConfigBits() {
        if (!getDataFolder().exists())
            getDataFolder().mkdir();

        File file = new File(getDataFolder(), "config.yml");


    if (!file.exists()) {
         try (InputStream in = getResourceAsStream("config.yml")) {
                Files.copy(in, file.toPath());
          } catch (IOException e) {
              e.printStackTrace();
            }
        }

    }
}

