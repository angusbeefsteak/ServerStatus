package net.angusbeefgaming.status;
import org.bukkit.plugin.java.JavaPlugin;

/*

Status Plugin
by Atticus Zambrana (TheBeefSteak)

Get the current Server Status

*/
public class StatusMain extends JavaPlugin {
  @Override
  public void onEnable() {
    this.getCommand("status").setExecutor(new StatusCommand());
  }
  @Override
  public void onDisable() {
    
  }
}
