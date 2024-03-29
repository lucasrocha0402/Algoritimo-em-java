package org.example;

import java.util.Scanner;

public class Mostrando_Ultima_Letra {

    public static char mostrarUltimaLetra(String nome){
        return nome.charAt(nome.length() - 1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome que deseja saber a ultima letra: ");
        String nome = teclado.nextLine();
        char ultimaLetra = mostrarUltimaLetra(nome);
        System.out.println("A ultima letra é: " + ultimaLetra);
    }
}
