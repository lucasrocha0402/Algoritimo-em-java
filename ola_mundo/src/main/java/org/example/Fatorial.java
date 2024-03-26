package org.example;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c,n,f;
        boolean r;
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            c = n;
            f = 1;
            do {
                f = f * c;
                c = c - 1;
            } while (c >= 1);
            System.out.println("Valor do fatorial de " + n + " é igual a " + f);
            System.out.print("Você quer continuar ?? [S/N]: ");
            r = teclado.next().equalsIgnoreCase("S");
        } while (r);
    }
}
