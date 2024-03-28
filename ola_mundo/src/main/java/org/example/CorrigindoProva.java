package org.example;

import java.util.Scanner;

public class CorrigindoProva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, j;
        String[] respostasCorretas = new String[4];

        System.out.println("Digite o numero de questões ");
        int num = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o gabarito: ");
        for (i = 0; i < num; i++) {
            System.out.println("Resposta da " + (i + 1) + " Questão:");
            respostasCorretas[i] = teclado.nextLine();
        }

        System.out.println("Digite o numero de alunos: ");
        int numeroAlunos = teclado.nextInt();
        teclado.nextLine();

        for (i = 0; i < numeroAlunos; i++) {
            System.out.println("Agora Digite o nome do aluno: ");
            String nomeAluno = teclado.nextLine();

            String[][] respostasAlunos = new String[numeroAlunos][num];

            for (i = 0; i < numeroAlunos; i++) {
                System.out.println("Resposta do aluno " + " numero " + (i + 1) + ": ");
                for (j = 0; j < num; j++) {
                    System.out.println("Resposta da questão: " + (j + 1));
                    respostasAlunos[i][j] = teclado.nextLine().toUpperCase();
                }
            }

            for (i = 0; i < numeroAlunos; i++) {
                int pontuacao = 0;
                for (j = 0; j < num; j++) {
                    if (respostasAlunos[i][j].equals(respostasCorretas[j])) {
                        pontuacao++;
                    }
                }
                System.out.println("Pontuação do aluno " + nomeAluno + " " + (i + 1) + pontuacao);
            }
        }
    }
}
