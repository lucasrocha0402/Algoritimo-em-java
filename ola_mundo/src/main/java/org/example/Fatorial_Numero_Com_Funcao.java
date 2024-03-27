package org.example;

import java.util.Scanner;

public class Fatorial_Numero_Com_Funcao {
    public static int N, F;

    public static int Fatorial(int V){
        int c, r = 1;
        for (c = 1; c <= V; c++ ){
            r = r * c;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        N = teclado.nextInt();
        F = Fatorial(N);
        System.out.print("O valor de " + N + "!" + " é igual a " + F);
    }
}
