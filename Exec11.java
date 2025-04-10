package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Digite a primeira frase: ");
        String frase2 = sc.nextLine();

        List<String> listaFrase = new ArrayList<>();
        listaFrase.add(frase1);
        listaFrase.add(frase2);

        listaFrase.sort(String::compareTo);
        System.out.println("Palavras em ordem: "+listaFrase);


        if(frase1.compareTo(frase2) > 0){
            System.out.println("A frase "+ frase1 +" é a maior das duas");
        }else{
            System.out.println("A frase "+ frase2 +" é a maior das duas");
        }
    }
}
