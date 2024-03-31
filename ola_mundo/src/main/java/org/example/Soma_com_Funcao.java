package org.example;

import java.util.Scanner;

public class Soma_com_Funcao {

    //função permite que trate a execução e a finalização mais rapido e limpo
    public static int V1, V2, S;
    public static int Soma(int X, int Y){
        return (X + Y);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        V1 = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        V2 = teclado.nextInt();
        S = Soma(V1, V2);
        System.out.println(S);
    }
}
