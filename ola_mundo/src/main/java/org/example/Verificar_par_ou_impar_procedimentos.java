package org.example;

import java.util.Scanner;

public class Verificar_par_ou_impar_procedimentos {
    public static int n;

    public static void ParOuImpar(int V){
        if (V % 2 == 0)
            System.out.print("O numero " + V + " é PAR");
        else
            System.out.print("O numero " + V + " é IMPAR");
    }

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        ParOuImpar(n);
    }

    // escopo é o local aonde determinada variavel vai funcionar; exemplo se ela tiver um public ela vai poder rodar em todo canto
    // e claro que tambem depende de onde ela está no escopo
    // passagem de parametro por referencia: passando o procedimento e usando
}
