package org.example;

import java.util.Scanner;

public class Melhor_aluno_da_turma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos alunos tem na turma: ");
        int alunos = teclado.nextInt();
        int soma = 0;
        float maior = 0;
        String aluno_maior_nota = "";



        for (int quantidade = 1; quantidade <= alunos; quantidade++){
            System.out.println("ALUNO " + (soma + quantidade));
            System.out.print("Nome do aluno: ");
             String nome = teclado.next();
            System.out.print("Nota de " + nome + ": ");
            float nota = teclado.nextFloat();

            if (nota > maior) {
                maior = nota;
                aluno_maior_nota = nome;
            }
            if (quantidade >= alunos)
                System.out.println("O maior nota foi: " + maior + " e foi de : " + aluno_maior_nota);
        }

    }
}
