package com.fellipefontanez.fellipefontanez.services;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class SessoesAtivas {
    private static HashMap<Long, String> lista = new HashMap<>();

    public static void addSessao(Long userId, String sessionId) {
        lista.put(userId, sessionId);
    }
    public static HashMap getLista(){
        return lista;
    }
}
