package org.example;

import java.util.Scanner;

public class Contagem_Inteligente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o inicio da contagem: ");
        int inicio = teclado.nextInt();
        System.out.println("Digite o fim da contagem: ");
        int fim = teclado.nextInt();
        if (inicio > fim)
            for (int contador = 0; contador <= inicio; contador ++)
                System.out.println(".." + contador);
        else
            for (int contador = 0; contador <= fim; contador ++)
                System.out.println(".." + contador);
    }
}
