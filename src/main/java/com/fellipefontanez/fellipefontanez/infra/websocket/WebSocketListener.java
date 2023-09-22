package com.fellipefontanez.fellipefontanez.infra.websocket;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketListener {
    @EventListener(SessionConnectEvent.class)
    private void handleWebsocketConnectListner(SessionConnectedEvent event) {
        System.out.println("fechou ao contrario");
        //StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());
        //System.out.println(sha.getId());

    }

    @EventListener(SessionDisconnectEvent.class)
    public void handleWebsocketDisconnectListner(SessionDisconnectEvent event) {
        System.out.println("fechou");
    }
}
