package org.example;

import java.util.Scanner;

public class Analizador_de_valores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int valor3 = teclado.nextInt();
        System.out.print("Digite o quarto valor: ");
        int valor4 = teclado.nextInt();
        System.out.print("Digite o quinto valor: ");
        int valor5= teclado.nextInt();


        int somaValores = valor1 + valor2 + valor3 + valor4 + valor5;
        System.out.println("A soma deles é: " + somaValores);

        int media = somaValores / 5;
        System.out.println("A media é: " + media);

        int diviseis = 5 % media;
        System.out.println("são divisiveis: " +  diviseis);

        System.out.println("Valores nulos: 0");
        if (valor1 == 0) {
            System.out.println("Primeiro valor: " + valor1);
        }
        if (valor2 == 0) {
            System.out.println("Segundo valor: " + valor2);
        }
        if (valor3 == 0) {
            System.out.println("Terceiro valor: " + valor3);
        }
        if (valor4 == 0) {
            System.out.println("Quarto valor: " + valor4);
        }
        if (valor5 == 0) {
            System.out.println("Quinto valor: " + valor5);
        }

        int somaPares = 0;

        if (valor1 % 2 == 0) {
            somaPares += valor1;
        }
        if (valor2 % 2 == 0) {
            somaPares += valor2;
        }
        if (valor3 % 2 == 0) {
            somaPares += valor3;
        }
        if (valor4 % 2 == 0) {
            somaPares += valor4;
        }
        if (valor5 % 2 == 0) {
            somaPares += valor5;
        }

        System.out.println("A soma dos valores pares é: " + somaPares);
    }
}
