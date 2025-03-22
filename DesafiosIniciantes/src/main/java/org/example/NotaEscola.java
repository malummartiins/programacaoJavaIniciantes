package org.example;

public class NotaEscola {

    public static char obterNota(int n1, int n2, int n3) {
        int media = (n1 + n2 + n3) / 3;
        if (media >= 90) return 'A';
        if (media >= 80) return 'B';
        if (media >= 70) return 'C';
        if (media >= 60) return 'D';
        return 'F';
    }

}
