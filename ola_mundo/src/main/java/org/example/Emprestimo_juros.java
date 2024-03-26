package org.example;

import java.util.Scanner;

public class Emprestimo_juros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quanto deseja pegar de emprestimo: ");
        float emprestimo = teclado.nextFloat();
        float valor_juros = (emprestimo * 20) / 100;
        float valor_total = emprestimo + valor_juros;
        System.out.println("Digite quantas parcelas você deseja realizar");
        float parcelas = teclado.nextFloat();
        float valor_parcelado = valor_total / parcelas;
        System.out.println("Voce vai pagar " + valor_parcelado);

        System.out.println("O juros de " + emprestimo + " é de " + valor_juros + "e o valor total é de " + valor_total );
    }
}
