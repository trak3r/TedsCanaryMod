package net.rudiment.canarymod;

import net.canarymod.Canary;
import net.canarymod.plugin.Plugin;

public class HelloWorld extends Plugin { 

    @Override
    public boolean enable() {
        Canary.hooks().registerListener(new HelloListener(), this);
        getLogman().info("Enabling "+getName() + " Version " + getVersion()); //getName() returns the class name, in this case HelloWorld
        getLogman().info("Authored by "+getAuthor());
        return true;
    }

    @Override 
    public void disable() {   
        // TODO Auto-generated method stub 
    } 
}
