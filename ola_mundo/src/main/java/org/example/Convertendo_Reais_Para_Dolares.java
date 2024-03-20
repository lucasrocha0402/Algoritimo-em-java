package org.example;

import java.util.Scanner;

public class Convertendo_Reais_Para_Dolares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos reais você tem ?: ");
        float reais = teclado.nextFloat();
        float dolares = 5.02f;
        float  dolares_convertidos= reais / dolares;
        System.out.println("Você vai ter: " + dolares_convertidos + " dolares");
    }
}
