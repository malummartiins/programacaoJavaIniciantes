package org.example;

public class Contador {
    public int contarOvelhas(Boolean[] arrayDeOvelhas) {
        int contador = 0;
        for (Boolean presente : arrayDeOvelhas) {
            if (presente != null && presente) {
                contador += 1;
            }
        }
        return contador;
    }
}
