package org.example;

public class SomaArray {
    public static double soma(double[] numeros) {

        double soma = 0;

        if (numeros == null){
            return 0;
        }

        for (int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        return soma;

    }
}
