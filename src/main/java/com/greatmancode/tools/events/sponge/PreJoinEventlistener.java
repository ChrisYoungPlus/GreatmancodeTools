package com.greatmancode.tools.events.sponge;

import com.greatmancode.tools.events.EventManager;
import com.greatmancode.tools.events.playerEvent.PreJoinEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.network.ClientConnectionEvent;

/**
 * Created for the AddstarMC Project. Created by Narimm on 17/10/2018.
 */
public class PreJoinEventlistener {
    
    @Listener
    public void onPreAuthEvent(ClientConnectionEvent.Login event){
        PreJoinEvent pjevent = new PreJoinEvent(event.getProfile().getName().get(),
                event.getProfile().getUniqueId());
        EventManager.getInstance().callEvent(pjevent);
    }
}
