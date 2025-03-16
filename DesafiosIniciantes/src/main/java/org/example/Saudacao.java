package org.example;

public class Saudacao {
   public static String cumprimentar(String nome, String dono) {
        return nome.equals(dono) ? "Olá chefe" : "Olá convidado";
    }
}
