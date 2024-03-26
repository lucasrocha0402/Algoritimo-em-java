package org.example;

import java.util.Scanner;

public class Fibonacci_em_java {
    public static void main(String[] args){
        Scanner telcado = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros da sequencia de fibonacci: ");
        int quantidade = telcado.nextInt();

        int primeiroNumero = 0;
        int segundo_nummero = 1;

        System.out.println("Sequencia de fibonacci: ");
        for (int i = 0; i < quantidade; i ++){
            System.out.print(primeiroNumero + " ");
            int proximoNumero = primeiroNumero + segundo_nummero;
            primeiroNumero = segundo_nummero;
            segundo_nummero = proximoNumero;
        }
    }
}
