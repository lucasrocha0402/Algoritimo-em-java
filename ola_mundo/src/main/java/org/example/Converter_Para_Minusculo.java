package org.example;

import java.util.Scanner;

public class Converter_Para_Minusculo {

    public static String converterParaMinusculo(String nome){
        return nome.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreve o nome que deseja alterar para minusculo: ");
        String nome = teclado.nextLine();
        String nomeMinusculo = converterParaMinusculo(nome);
        System.out.println("O nome em minusculo fica: " + nomeMinusculo);
    }
}
