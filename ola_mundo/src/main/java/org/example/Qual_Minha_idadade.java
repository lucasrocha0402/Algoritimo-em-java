package org.example;

import java.util.Scanner;

public class Qual_Minha_idadade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Em que ano nos estamos ?");
        int ano_atual = teclado.nextInt();
        System.out.println("Qual ano você nasceu");
        int ano_nascimento = teclado.nextInt();
        int idade = ano_atual - ano_nascimento;
        System.out.println("Sua idade é de: " + idade);

    }
}
