package org.example;

import java.util.Scanner;

public class Converter_Para_Maiusculo {

    public static String ConverterParaMaiusculo(String nome){
        return nome.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome que deseja converter para maiusculo: ");
        String nome = teclado.nextLine();
        String nomeMaiusculo = ConverterParaMaiusculo(nome);
        System.out.println("Nome em maiusculo: " + nomeMaiusculo);
    }
}

