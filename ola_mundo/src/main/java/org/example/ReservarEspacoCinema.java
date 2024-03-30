package org.example;

import java.util.Scanner;

public class ReservarEspacoCinema {
    private static char[][] seats = new char[5][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                seats[i][j] = 'O';
            }
        }

        while (true) {
            System.out.println("Mapa de Assentos:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Digite a linha desejada (1-5): ");
            int row = scanner.nextInt();
            System.out.print("Digite a coluna desejada (1-10): ");
            int column = scanner.nextInt();

            if (row < 1 || row > 5 || column < 1 || column > 10) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            if (seats[row - 1][column - 1] == 'X') {
                System.out.println("Desculpe, esse assento já está ocupado.");
            } else {
                seats[row - 1][column - 1] = 'X';
                System.out.println("Assento reservado com sucesso!");
            }
        }
    }
}
