package org.example;

import java.util.Scanner;

public class Maior_peso_com_procedimento {
    public static int i;
    public static String n;
    public static String pesado = "aa";
    public static double P, mai = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        procedimento(mai);
        for (i = 1; i <= 5; i++) {
        System.out.print("Digite o nome: ");
        n = teclado.nextLine();
        System.out.print("Digite o peso de " + n + ": ");
        P = teclado.nextInt();
        teclado.nextLine();
        if (P > mai) {
            mai = P;
            pesado = n;
        }
        procedimento(mai);
    }
        procedimento(mai);
        System.out.print("A pessoa mais pesada foi " + pesado + " Com " + mai + " quilos");
    }
    //procedimentos são usados para economizar o código/ utilizar metodos especificos e que se possam repetir.
    // passagem de parametro por valor
    public static void procedimento(double mai){
        System.out.println("----------------------------");
        System.out.println("D E T E C T O R DE P E S A D O ");
        System.out.println("Maior peso até agora: " + mai + " Kg");
    }
}
