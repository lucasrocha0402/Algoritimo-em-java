package org.example;

import java.util.Scanner;

public class Contador_Super_inteligente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3){
        System.out.println(" | MENU | ");
        System.out.println(" 1  De 1 a 10");
        System.out.println(" 2  DE 10 a 0");
        System.out.println(" 3  Sair ");
        System.out.println("Escolha uma opção");
            opcao = teclado.nextInt();
        int c = 0,n = 10;


            switch (opcao) {
                case 1:
                    do {
                        System.out.print(c + " ");
                        c++;
                    }
                    while (c <= n);
                    break;
                case 2:
                    do {
                        System.out.print(n + " ");
                        n--;
                    } while (n >= c);
                    break;
            }
        }
    }
}
