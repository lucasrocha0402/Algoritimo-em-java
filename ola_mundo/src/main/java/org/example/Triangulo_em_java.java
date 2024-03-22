package org.example;

import java.util.Scanner;

public class Triangulo_em_java {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int l1 = teclado.nextInt();

        System.out.print("Digite o segundo lado: ");
        int l2 = teclado.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int l3 = teclado.nextInt();

        boolean triangulo_validado = (l3 + l2 > l1) && (l1 + l2 > l3) && (l1 + l3 > l2);
        boolean triangulo_equilatero = (l1 == l2) && (l2 == l3);
        boolean triangulo_isosceles = (l1 == l2) || (l2 == l3) || (l1 == l3);
        boolean triangulo_escaleno = (l1 != l2) && (l2 != l3) && (l1 != l3);

        if (triangulo_validado){
            System.out.println("O triangulo é valido: ");

            System.out.println("Equilatero " +  triangulo_equilatero);
            System.out.println("Isosceles " + triangulo_isosceles);
            System.out.println("Escaleno " + triangulo_escaleno);
        } else {
            System.out.println("O triangulo não é valido");
        }

    }
}
