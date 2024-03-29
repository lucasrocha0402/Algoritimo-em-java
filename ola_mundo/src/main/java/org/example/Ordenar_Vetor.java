package org.example;

import java.util.Scanner;

public class Ordenar_Vetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vet = new int[4];
        int i, j, aux = 0;

        for (i = 0; i < 4; i++) {
            System.out.print("Digite um valor: ");
            vet[i] = teclado.nextInt();
        }
        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 4; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for (i = 0; i < 4; i++) {
            System.out.print("{" + vet[i] + "}");
        }
    }
}
