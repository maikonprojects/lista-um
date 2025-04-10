package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {
        String vogais = "aeiouAEIOU";
        String espaco = " ";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        Integer espacoBrancoCount = 0;
        Integer vogalCount = 0;
        Integer consoanteCount = 0;

        System.out.println(frase);

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isWhitespace(frase.charAt(i))) {
                espacoBrancoCount++;
            }
            char letra = frase.charAt(i);
            if(vogais.contains(String.valueOf(letra))){
                vogalCount++;
            }else{
                consoanteCount++;
            }

        }

        System.out.println("Espaços em brancos: "+espacoBrancoCount+" - Quantidade de vogais "+ vogalCount +" e quantidade de consoantes: " + consoanteCount);

    }
}
