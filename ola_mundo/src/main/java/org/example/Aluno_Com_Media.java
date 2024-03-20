package org.example;

import java.util.Scanner;

public class Aluno_Com_Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        if ( media >= 7)
            System.out.println("Você foi aprovado e sua media ficou: " + media );
        else
            if ((media >= 5) && (media < 7))
             System.out.println("Você ficou de recuperação e sua media ficou: " + media);
            else
                System.out.println("Você está reprovado e sua media foi: " + media);
    }
}
