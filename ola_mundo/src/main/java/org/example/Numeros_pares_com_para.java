package org.example;


import java.util.Scanner;

public class Numeros_pares_com_para {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont;
        System.out.print("Digite um valor: ");
        int V = teclado.nextInt();
        if (V % 2 == 1)
            V = V -1;
        for (cont = V; cont >= 0; cont -= 2)
            System.out.print(cont + " ");

    }
}
