package org.example;

import java.util.Scanner;

public class Taxacao_brasil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        float preco = teclado.nextFloat();
        float imposto = (preco * 60) / 100;
        System.out.print("Você tem que pagar: " + imposto + " de imposto faz o L");

    }
}
