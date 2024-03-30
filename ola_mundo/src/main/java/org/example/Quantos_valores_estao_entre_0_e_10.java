package org.example;

import java.util.Scanner;

public class Quantos_valores_estao_entre_0_e_10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int c, tot010 = 0, Simp = 0, Sfora = 0;

        for(c = 1; c <= 6; c++){
            System.out.print("Digite um valor: ");
            int v = teclado.nextInt();

            if (v >= 0 && v <= 10) {
                tot010 = tot010 + 1;
                if (v % 2 == 1)
                    Simp = Simp + v;
            }
            else
                Sfora = Sfora + v;
        }
        System.out.println("Ao todos foram " + tot010  + " valores entre 0 e 10");
        System.out.println("Nesse intervalo a soma de impares foi " + Simp);
        System.out.println("E fora do intervalo a soma foi de " + Sfora);
    }
}
