package org.example;

import java.util.Scanner;

public class DependentesFuncionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float NSal;
        System.out.println("Qual o nome do funcionario: ");
        String nome = teclado.nextLine();
        System.out.println("Qual o salario do funcionario: ");
        float sal = teclado.nextFloat();
        System.out.println("Qual é a quantidade de dependentes: ");
        int Dep = teclado.nextInt();
        switch (Dep){
            case 0:
                NSal = sal + ((sal * 5)/100);
                System.out.println("Seu aumento é de: " + NSal);
            break;
            case 1,2,3:
                NSal = sal + ((sal * 10) /100);
                System.out.println("Seu aumento é de: " + NSal);
            break;
            case 4,5,6:
                NSal = sal + ((sal * 15)/100);
                System.out.println("Seu aumento é de: " + NSal);
            break;
            default:
                NSal = sal + ((sal * 18)/100);
                System.out.println("Seu aumento é de: " + NSal);
            break;
        }
    }
}
