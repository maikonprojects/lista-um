package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> km = new ArrayList<>();
        List<Double> litros = new ArrayList<>();

        Double rep = 0.0;
        String ax = "";
        
        while (!Objects.equals(ax, "n")){
            System.out.println("Quantidade de km: ");
            km.add(sc.nextDouble());
            
            System.out.println("Quantidade de litros: ");
            litros.add(sc.nextDouble());

            System.out.println("Deseja registrar mais um ? s/n");
            ax = sc.next();
        }

        float totalKm = 0;
        float totalLitros = 0;

        for (int i = 0; i < litros.size() ; i++) {
            System.out.println("Automovel "+(i + 1)+" - " + km.get(i)/litros.get(i));
            totalKm += km.get(i);
            totalLitros += litros.get(i);
        }
        System.out.println("Total de km: " + totalKm);
        System.out.println("Total de litros: " + totalLitros);

    }
}
