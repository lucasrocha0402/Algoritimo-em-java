package org.example;

import java.util.Scanner;

public class Par_e_impa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero que você deseja saber se é par ou impar: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0)
         System.out.println("O numero é par");
        else
            System.out.println("O numero é impar ");
    }
}
