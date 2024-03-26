package org.example;

import java.util.Scanner;

public class Habilitacao_de_trasinto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18)
            System.out.println("Você pode tirar a carteira de habilitação");
        else
            System.out.println("Você não pode tirar a carteira de habilitação");
    }
}
