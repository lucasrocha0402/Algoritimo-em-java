package org.example;

import java.util.Scanner;

public class Imc_em_java {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        float peso = teclado.nextFloat();
        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();
        float imc = peso / (altura * 2);
        if (imc < 17)
            System.out.println("Muito abaixo do peso");
        else
            if ((imc >= 17) && (imc < 18.5))
                System.out.println("Abaixo do peso");
            else
                if ((imc >= 18.5) && (imc < 25))
                    System.out.println("Peso ideal");
                else
                    if ((imc >= 25) && (imc < 30))
                        System.out.println("Sobrepeso");
                    else
                        if ((imc >= 30) && (imc < 35))
                            System.out.println("Obesidade");
                        else
                            if ((imc >= 35) && (imc < 40))
                                System.out.println("Obesidade severa");
                            else
                                System.out.println("Você está em obesidade morbida");
    }
}
