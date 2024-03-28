package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Campeonato_Futebol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomeTime = new String[4];
        int a;

        for (a = 0; a < 4; a++){
            System.out.println("Nome do " + (a + 1)  + " time");
            nomeTime[a] = teclado.nextLine();
        }

        System.out.println("Confrontos");
        for ( a = 0; a < 4; a++) {
            for (int j = a + 1; j < 4; j++) {
                System.out.println(nomeTime[a] + " x " + nomeTime[j]);
                System.out.println(nomeTime[j] + " x " + nomeTime[a]);
            }
        }
    }
}
