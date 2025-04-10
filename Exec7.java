package org.example;

public class Exec7 {
    public static void main(String[] args) {
        double ax = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0){
                ax = (double) i / 2;
                System.out.println("A divisão de "+ i +" por 2 é: " + ax);
            }
        }
    }
}
