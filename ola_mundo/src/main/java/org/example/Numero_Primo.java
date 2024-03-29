package org.example;

import java.util.Scanner;

public class Numero_Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int C = 1, N,contDiv = 0;
        System.out.print("Digite um numero: ");
        N = teclado.nextInt();
        do {
            if (N % C == 0)
                contDiv = contDiv + 1;
            C = C + 1;
        } while ( C <= N);
        if (contDiv > 2)
            System.out.println("O valor " + N + " ele não é primo");
        else
            System.out.println("O valor " + N + " ele é primo");
    }
}
