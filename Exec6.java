package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exec6 {
    public static void main(String[] args) {

        List<Float> numImpares = new ArrayList<>();

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0){
                Float addImpar = (float) i;
                numImpares.add(addImpar);
            }
        }

        float primeiro = numImpares.get(0);

        //System.out.println(numImpares);
        float total = primeiro;
        Integer totalInt = (int) primeiro;
        for (int i = 1; i < numImpares.size() - 1 ; i++) {
            total *= numImpares.get(i);
            float ax = numImpares.get(i);
            System.out.println(totalInt);
            totalInt *= (int) ax;

        }
        System.out.println(total);
        System.out.println(totalInt);
    }
}
