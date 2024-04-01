package org.example;

import java.util.Scanner;

public class Vetores_Em_Java {
    public static void main(String[] args) {
        Scanner telcado = new Scanner(System.in);

        int[] vetoresInteiros = new int[6];

        for (int c = 0; c < 6; c++) {
            System.out.print("Digite o " + c + " o valor: ");
            vetoresInteiros[c] = telcado.nextInt();
        }
        System.out.println("O valor digitado foi ");
        for (int i = 0; i < 6; i++) {
            System.out.println(vetoresInteiros[i] + " ");
        }
    }
}
