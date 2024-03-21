package org.example;

import java.util.Scanner;

public class Partida_Futebol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos gols do Fortaleza: ");
        int gols_leao = teclado.nextInt();
        System.out.println("Quantos gols do veacu: ");
        int gols_veacu = teclado.nextInt();
        int resultado = gols_leao - gols_veacu;
        switch (resultado){
            case 1,2,3:
                System.out.println("Partida normal, diferença de gols: " + resultado);
            break;
            case 0:
                System.out.println("Empate, diferença de gols: " + resultado);
            break;
            case 5,6,7:
                System.out.println("Goleada, diferença de gols: " + resultado);

        }
    }
}
