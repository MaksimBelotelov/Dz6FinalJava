package org.example.cw1;

// Дан массив чисел. Посчитать процент уникальных чисел.

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1,1,1,1,2,4));
        Set<Integer> set = new HashSet<>(array);
        double pr = set.size()*100 / array.size();
        System.out.println(pr);
    }
}
