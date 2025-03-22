package org.example;

public class Alarme {
    public static boolean definirAlarme(boolean empregado, boolean ferias) {
        return empregado && !ferias;
    }
}
