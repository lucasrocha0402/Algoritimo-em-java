package org.example;

import java.util.Scanner;

public class Aproveitamento_Aluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        int nota1 = teclado.nextInt();
        System.out.print("Digite a segunda nota do aluno: ");
        int nota2 = teclado.nextInt();
        int media = (nota1 + nota2) /2;
        switch (media) {
            case 9,10:
                System.out.println("O aproveitamento de " + nome + " foi A. e sua media foi " + media);
            break;
            case 8:
                System.out.println("O aproveitamento de " + nome + " foi B. e sua media foi " + media);
            break;
            case 7:
                System.out.println("O aproveitamento de " + nome + " foi C. e sua media foi " + media);
            break;
            case 6:
                System.out.println("O aproveitamento de " + nome + " foi D. e sua media foi " + media);
            break;
            case 5:
                System.out.println("O aproveitamento de " + nome + " foi E. e sua media foi " + media );
            break;
            default:
                System.out.println("O aproveitamento de " + nome + " foi F. e sua media foi " + media);
        }
    }
}
