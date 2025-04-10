package org.example;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        Integer num = sc.nextInt();

        for (int i = 2; i <= num; i++) {

         if((i == 3 || i == 5) || (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)){
             System.out.println(i);
         }

        }
    }
}
