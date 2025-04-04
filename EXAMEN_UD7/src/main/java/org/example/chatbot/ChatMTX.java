package org.example.chatbot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatMTX {


    private static Map<String, String> respuestas = new HashMap<>();


    public ChatMTX() {
        introducirMemoria();
    }

    private void introducirMemoria() {
        respuestas.put("hola","Hola, ¿En qué te puedo ayudar?");
        respuestas.put("¿cómo estás?", "¡Estoy lista para ayudarte!");
        respuestas.put("adiós", "¡Hasta luego!");
        respuestas.put("gracias", "¡De nada! Que tengas un buen día.");
        respuestas.put("salir","¡Adiós!");
    }

    public boolean responder(String res) {

        if (respuestas.containsKey(res.toLowerCase())) {
            System.out.println("ChatMTX: " + respuestas.get(res.toLowerCase()));
        } else {
            System.out.println("ChatMTX: No te entiendo :(");
        }
        if (res.equalsIgnoreCase("salir")) {
            return false;
        }
        return true;

    }





}
