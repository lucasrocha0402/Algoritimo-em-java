package org.example;

import java.util.Scanner;

public class Somador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, S = 0;
        boolean resp = false ;

        do {
            System.out.println("Digite o valor ==> ");
            N = teclado.nextInt();
            S += N;
            System.out.println("Você quer continuar ?? [S/N]: ");
            resp = teclado.next().equalsIgnoreCase("S");
        } while (resp);
        System.out.println("A soma dos números é: " + S);

    }
}
