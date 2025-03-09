package org.example;

public class Troll {

    public static String removerVogais(String str){

        return str.replaceAll("(?i)[aeiou]", "");

    }

}
