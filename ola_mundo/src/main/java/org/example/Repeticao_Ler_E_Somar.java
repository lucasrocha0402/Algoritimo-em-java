package org.example;

import java.util.Scanner;

public class Repeticao_Ler_E_Somar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int maior = 0;
        int menor = 0;
        for (int contador = 1; contador <=5; contador ++ ){
            System.out.print("Digite o " + contador + "o. valor: ");
            int m = teclado.nextInt();
            soma += m;
            if (m > maior)
                maior = m;
            if (m > menor)
                menor = m / contador;
        }
        System.out.println("A soma de todos os valores foi: " + soma + " e o maior numero foi " + maior + " e o menor foi " + menor);
    }
}
