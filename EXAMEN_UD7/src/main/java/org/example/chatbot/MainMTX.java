package org.example.chatbot;

import java.util.Scanner;

public class MainMTX {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ChatMTX gpt = new ChatMTX();
        System.out.println("ChatMTX: Bienvenido! Escribe <salir> cuando quieras acabar la conversación...");
        boolean salida = true;
        while (salida) {
            System.out.println("Tú:");
            salida = gpt.responder(in.nextLine());
        }

    }

}
