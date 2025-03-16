package org.example;

public class Semaforo {
    public static String atualizarSemaforo(String atual) {
        switch (atual) {
            case "vermelho": return "verde";
            case "amarelo": return "vermelho";
            case "verde": return "amarelo";
            default: throw new IllegalArgumentException();
        }
    }
}
