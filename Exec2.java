package org.example;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        Double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        Double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.println("O número "+ num1 +" é o maior");
        }else {
            System.out.println("O número "+ num2 +" é o maior");
        }

    }
}