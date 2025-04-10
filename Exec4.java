package org.example;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em milhas para cconverter");
        Double num = sc.nextDouble();

        System.out.println("A distância em km é: " + (num * 1.609) + " milhas");
    }
}
