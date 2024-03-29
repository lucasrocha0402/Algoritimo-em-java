package org.example;

import java.util.Scanner;

public class Par_E_Impa_Funcao {
    public static  int n,R;

    public static  int ParOuImpar(int V){
         if (V % 2 == 0) {
             System.out.println("PAR");
             return 0;
         } else {
             System.out.println("IMPAR");
             return 1;
         }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = teclado.nextInt();
        R = ParOuImpar(n);
    }
}
