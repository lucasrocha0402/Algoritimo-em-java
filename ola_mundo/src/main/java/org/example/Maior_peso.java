package org.example;

import java.util.Scanner;

public class Maior_peso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        String n,pesado = "aa";
        double P, mai = 0;
        System.out.println("----------------------------");
        System.out.println("D E T E C T O R DE P E S A D O ");
        System.out.println("Maior peso até agora: " + mai + " Kg");

        for (i = 1; i <= 5; i++ ){
            System.out.print("Digite o nome: ");
            n = teclado.nextLine();

            System.out.print("Digite o peso de " + n + ": ");
            P = teclado.nextFloat();
            teclado.nextLine();

            if (P > mai){
                mai = P;
                pesado = n;
        }
            System.out.println("----------------------------");
            System.out.println("D E T E C T O R DE P E S A D O ");
            System.out.println("Maior peso até agora: " + mai + " Kg");
        }
        System.out.println("----------------------------");
        System.out.println("D E T E C T O R DE P E S A D O ");
        System.out.println("Maior peso até agora: " + mai + " Kg");
        System.out.println("----------------------------");
        System.out.println("A pessoa mais pesada foi " + pesado + " Com " + mai + " quilos");

    }
}
