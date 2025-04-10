package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
        String[] diaSemana = {"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado", "domingo"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para representar o dia da semana");
        Integer num = sc.nextInt();

        if(num > 7 || num < 0){
            System.out.println("Dia não econtrado, digite um número de 1 a 7");
        }else{
            String dia = diaSemana[num - 1];
            System.out.println(dia);
        }

    }
}
