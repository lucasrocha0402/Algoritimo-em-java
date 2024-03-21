package org.example;

import java.util.Scanner;

public class Conta_Negativa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c = 1,n, totN = 0;
        do {
            System.out.print("Digite um numero ");
            n = teclado.nextInt();
            if (n < 0)
                totN = totN + 1;
            c = c + 1;
        } while ( c <= 5);
        System.out.println("Foram digitados: " + totN + " valores negativos");
    }
}
