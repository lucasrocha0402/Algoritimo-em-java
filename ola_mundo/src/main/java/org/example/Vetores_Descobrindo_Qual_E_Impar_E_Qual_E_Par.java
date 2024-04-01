package org.example;

import java.util.Scanner;

public class Vetores_Descobrindo_Qual_E_Impar_E_Qual_E_Par {
    public static void main(String[] args) {

        Scanner telcado = new Scanner(System.in);

        int[] vetoresInteiros = new int[6];

        for (int c = 0; c < 6; c++) {
            System.out.print("Digite o " + c + " valor ");
            vetoresInteiros[c] = telcado.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            if (vetoresInteiros[i] % 2 == 0){
                System.out.println("O numero é par " + vetoresInteiros[i] + " e esta na posição " + i);
            } else
                System.out.println("O numero é impar " +  vetoresInteiros[i] + " e esta na posição " + i);
        }
    }
}
