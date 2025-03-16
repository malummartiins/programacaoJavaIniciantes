package org.example;

import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente {
    public static int ordenarDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
