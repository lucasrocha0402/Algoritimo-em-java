package org.example;

import java.util.Scanner;

public class Mostrando_Se_Tem_A {
    public static int verificaA(String nome){
        int posicao = nome.indexOf('a');
        return posicao;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o nome que deseja verificar se tem a: ");
        String nome = teclado.nextLine();
        int temA = verificaA(nome);
        if (temA != -1){
            System.out.println("A letra 'a' está na posição:  " + temA);
        } else {
            System.out.println("A letra 'a' não foi encontrada");
        }
    }
}
