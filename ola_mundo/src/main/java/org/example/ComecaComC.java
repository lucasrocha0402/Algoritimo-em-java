package org.example;

import java.util.Scanner;

public class ComecaComC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char SoC[] = new char[10];
        int i, tot = 0;
        for (i = 1; i <= 10; i++){
            System.out.print("Digite seu nome: ");
            String nome = teclado.nextLine();
            char primeiroNome = nome.charAt(0);
            char c = 'c';
            char C = 'C';
            if (primeiroNome == c || primeiroNome == C){
                tot = tot + 1;
                SoC[tot] = primeiroNome;
                System.out.println(nome + " Começa com " + primeiroNome);
            } else
                System.out.println("Não começa com c");
        }
        System.out.println("O total foi de: " + tot);
    }
}
