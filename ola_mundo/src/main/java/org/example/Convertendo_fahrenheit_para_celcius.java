package org.example;

import java.util.Scanner;

public class Convertendo_fahrenheit_para_celcius {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor em fahrenheit: ");
        float fahrenheit = teclado.nextFloat();
        float celcius = (float) ((fahrenheit - 32) /  1.8);
        System.out.println(" O valor em fahrenheit é :" + celcius);
    }
}
