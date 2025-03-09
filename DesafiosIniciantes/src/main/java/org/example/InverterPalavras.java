package org.example;

public class InverterPalavras {

    public String inverterPalavras(String frase){
        String[] palavras = frase.split(" ");

        for(int i = 0; i < palavras.length; i++){  //percorreu
            if(palavras[i].length() >= 5){ //identificou
                palavras[i] = new StringBuilder(palavras[i]).reverse().toString(); //inverteu

            }
        }
        return String.join(" ", palavras);
    }
}
