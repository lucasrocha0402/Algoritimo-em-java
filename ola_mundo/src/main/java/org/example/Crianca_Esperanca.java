package org.example;

import java.util.Scanner;

public class Crianca_Esperanca {
    public static void main(String[] args) {
        System.out.println("Muito obrigado por ajudar");
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 para doar R$ 10,00");
        System.out.println("2 para doar R$ 25,00");
        System.out.println("3 para doar R$ 50,00");
        System.out.println("4 para doar outros valores");
        System.out.println("5 para cancelar");
        int d = teclado.nextInt();
        switch (d){
            case 1:
                System.out.println("Doar 10");
            break;
            case 2:
                System.out.println("Doar 25");
            break;
            case 3:
                System.out.println("Doar 50");
            break;
            case 4:
                System.out.println("Doar outros valores");
                int valor = teclado.nextInt();
                System.out.println("Sua doação foi de " + valor);
            break;
            case 5:
                System.out.println("Cancelar");
            break;

        }

    }
}
