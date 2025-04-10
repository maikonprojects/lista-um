package org.example;

import java.util.Scanner;

public class Exec9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio");
        Double r = sc.nextDouble();

        Double a = 3.14 * Math.pow(r, 2);


        System.out.println("A area a do circulo é: "+ Math.round(a));


    }
}
