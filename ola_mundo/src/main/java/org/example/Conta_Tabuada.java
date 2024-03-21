package org.example;

import java.util.Scanner;

public class Conta_Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1,n,r = 0;
        System.out.println("Quer ver a tabuada de qual numero ? ");
        n = teclado.nextInt();

       do {
        r = n * cont;
        System.out.println(n + " x " + cont + " = " + r);
        cont = cont + 1;
       } while (cont < 10);
    }
}
