package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        String convertido = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {

            convertido += palavra.charAt(i);
        }
        if(palavra.equals(convertido)){
            System.out.println("A palavra "+ palavra+" pode ser lida da esquerda pra direita ou da direita pra esquerda");
        }else {
            System.out.println("A palavra "+ palavra+" nõo pode ser lida da esquerda pra direita ou da direita pra esquerda");
        }


    }
}
