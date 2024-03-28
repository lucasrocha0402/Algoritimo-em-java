package org.example;

import java.util.Scanner;

public class Mostrando_Primeira_Letra {

    public static char mostrarPrimeiraLetra(String nome){
        return nome.charAt(0);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome que você deseja descobrir a primeira letra: ");
        String nome = teclado.nextLine();
        char primeiraLetra = mostrarPrimeiraLetra(nome);

        System.out.println("A primeira letra é: " + primeiraLetra);

    }
}
