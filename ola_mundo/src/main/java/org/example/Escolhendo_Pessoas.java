package org.example;

import java.util.Scanner;

public class Escolhendo_Pessoas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcao = "s", f;
        int quantidadeMasculino = 0, quantidadeFeminina = 0, idadeM, idadeF;
        int maior_IdadeM = 0;
        int maior_IdadeF = 0;
        int cabelo, cabeloP = 0, cabeloC = 0, cabeloL = 0, cabeloR = 0;

        while (!opcao.equals("n")) {
            System.out.println("Teste ?");
            opcao = teclado.next();

            if (!opcao.equals("n")) {
                System.out.println("Qual o sexo ? [M/F]");
                f = teclado.next();
                if (f.equals("m")) {
                    quantidadeMasculino++;
                    System.out.println("Qual a idade ? ");
                    idadeM = teclado.nextInt();
                    if (idadeM >= 18) {
                        maior_IdadeM++;
                    }
                    System.out.println("Qual a cor de cabelo ?");
                    System.out.println("1 Preto");
                    System.out.println("2 Castanho");
                    System.out.println("3 Loiro");
                    System.out.println("4 Ruivo");
                    cabelo = teclado.nextInt();
                    switch (cabelo) {
                        case 1:
                            cabeloP++;
                            break;
                        case 2:
                            cabeloC++;
                            break;
                        case 3:
                            cabeloL++;
                            break;
                        case 4:
                            cabeloR++;
                            break;
                    }
                } else if (f.equals("f")) {
                    quantidadeFeminina++;
                    System.out.println("Qual a idade ? ");
                    idadeF = teclado.nextInt();
                    if (idadeF >= 25 && idadeF <= 30) {
                        maior_IdadeF ++;
                        System.out.println("Qual a cor de cabelo ?");
                        System.out.println("1 Preto");
                        System.out.println("2 Castanho");
                        System.out.println("3 Loiro");
                        System.out.println("4 Ruivo");
                        cabelo = teclado.nextInt();
                        if (cabelo == 4) {
                            cabeloR++;
                        }
                    }
                }
                System.out.println("Quantidade masculina: " + quantidadeMasculino + " e maior de idade  " + maior_IdadeM + " e cabelo castanho " + cabeloC);
                System.out.println("Quantidade feminino: " + quantidadeFeminina + " e maior de idade " + maior_IdadeF + " e cabelo ruivo " + cabeloR);
            }
        }
    }
}
