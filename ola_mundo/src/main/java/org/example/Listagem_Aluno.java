package org.example;

import java.util.Scanner;

public class Listagem_Aluno {
    public static void main(String[] args) {
        String[] nome = new String[6];
        int[] n1 = new int[6];
        int[] n2 = new int[6];
        int[] m = new int[6];

        Scanner teclado = new Scanner(System.in);
        for (int c = 1; c <= 4; c ++){
            System.out.println("Aluno " + c);
            System.out.print("Nome: ");
            nome[c] = teclado.nextLine();
            System.out.print("Primeira nota: ");
            n1[c] = teclado.nextInt();
            System.out.print("Segunda nota: ");
            n2[c] = teclado.nextInt();
            teclado.nextLine();
            m[c] = (n1[c] + n2[c]) / 2;
        }

        System.out.println("LISTAGEM DE ALUNOS");
        System.out.println("--------------------");
        for (int i = 1; i <= 4; i++){
            System.out.println("O alun@ " + nome[i] + " teve a media: " +m[i]);
            if (m[i] >= 8 )
                System.out.println("Parabens você está acima da media " + nome[i]);
            else
                System.out.println("Poxa, se esforce mais para melhorar " + nome[i]);
        }
    }
}
