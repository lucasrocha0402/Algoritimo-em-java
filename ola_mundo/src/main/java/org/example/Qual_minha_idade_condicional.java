package org.example;

import java.util.Scanner;

public class Qual_minha_idade_condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Em que ano nos estamos ?");
        int ano_atual = teclado.nextInt();
        System.out.print("Qual ano você nasceu: ");
        int ano_nascimento = teclado.nextInt();
        int idade = ano_atual - ano_nascimento;
        System.out.println("Sua idade é de: " + idade);

        if (idade >= 18)
            System.out.println("Você já é maior de idade");
        else
            System.out.println("Você é menor de idade ");
    }
}
