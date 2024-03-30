package org.example;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor que você quer contar até quanto: ");
        int valor = teclado.nextInt();
        System.out.println("Qual será o valor do salto: ");
        int salto = teclado.nextInt();
        for ( int contagem = 0; contagem <= valor; contagem += salto){
            System.out.println("Integração " + contagem);
        }
        System.out.println("Minha contagem foi encerrada");
    }
}
