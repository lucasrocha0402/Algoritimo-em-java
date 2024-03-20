package org.example;

import java.util.Scanner;

public class Conversor_De_Moedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas vezes deseja converter: ");
        int q = teclado.nextInt();

        for (int c = 1; c <= q; c++) {
            System.out.println("Qual o valor deseja converter: ");
            float real = teclado.nextFloat();
            float dolar = 5.5f;
            float dolar_convertido = real / dolar;
            System.out.println("Você vai ter: " + dolar_convertido);
        }
    }
}
