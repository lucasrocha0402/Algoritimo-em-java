package org.example;

import java.util.Scanner;

public class Usando_Procedimento_Para_Contar_Numeros_De_String {

    public static int Contador(String nome){
        return nome.length();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = teclado.nextLine();
        int quantidadeLetras = Contador(nome);
        System.out.println("O nome " + nome + " possui " + quantidadeLetras + " letras ");
    }
}
