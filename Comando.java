import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Comando extends Command{

    private Object otro = ("survival, skywars");

	public Comando() {
        super("Lobby");
   }
	
public void execute(CommandSender sender, String[] args) {
    if ((sender instanceof ProxiedPlayer)) {
      ProxiedPlayer p = (ProxiedPlayer)sender;
p.sendMessage(new ComponentBuilder ("Connecting you to the lobby!").color(ChatColor.RED).create());    

p.connect(ProxyServer.getInstance().getServerInfo("lobby"));

Object otro = ("survival, skywars");

if("lobby".equals(otro)) {
	
	this.otro = otro;
	
	
	
	
	
}
 
}

}
}
