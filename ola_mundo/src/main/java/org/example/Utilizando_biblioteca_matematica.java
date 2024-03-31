package org.example;

import java.util.Scanner;

// essa classe faz parte dos operadores aritimeticos da matematica
public class Utilizando_biblioteca_matematica {
    public static void main(String[] args) {
        // instanciando o objeto do metodo da classe scanner
        Scanner teclado = new Scanner(System.in);
        // printando uma pergunta para o usuario
        System.out.println("Digite o numero que você quer saber o seno: ");
        // informando o valor das variaveis que recebem o metodo math, e informando que o numero vai vir do console
        double angulo = teclado.nextDouble();
        double angulo_radiano = Math.toRadians(angulo);
        System.out.println("Este é o valor:" + Math.sin(angulo_radiano) );
    }
}
