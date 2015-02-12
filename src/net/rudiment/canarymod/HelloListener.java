package net.rudiment.canarymod;

import net.canarymod.chat.Colors;
import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.ConnectionHook;
import net.canarymod.plugin.PluginListener;

public class HelloListener implements PluginListener {

    @HookHandler
    public void onLogin(ConnectionHook hook) {
        hook.getPlayer().message(Colors.YELLOW+"Hello World, "+hook.getPlayer().getName());
    }
}