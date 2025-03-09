package org.example;

public class MinMax {

    public int min(int[] list){

        int min = list[0]; //primeiro era o menor

        for(int i = 1; i < list.length; i++){ //percorrendo cada numero
            if(min > list[i])
                min = list[i];
        }
        return min;
    }

    public int max(int[] list){
        int max = list[0];

        for(int i = 1; i < list.length; i++){
            if( max < list[i])
                max = list[i];
        }
        return  max;
    }

}
