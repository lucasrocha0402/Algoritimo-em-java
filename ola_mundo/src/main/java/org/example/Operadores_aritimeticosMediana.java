package org.example;

import java.util.Scanner;

public class Operadores_aritimeticosMediana {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextInt();
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextInt();
        float media = (nota1 + nota2 ) / 2;
        System.out.println("A soma de " + nota1 + " + " + nota2 + " é igual a " + media);
    }
}

