package org.example;

public class Somando_Com_Parametro_de_referencia {
    public static int x;
    public static int y;

    public static void main(String[] args) {
        System.out.println();
        x = 5;
        y = 3;
        Soma(x, y);
    }

    public static void Soma(int a, int b) {
        a = a + 1;
        b = b + 2;
        System.out.println("Recebi o valor  " + a);
        System.out.println("Recebi o valor " + b);
        System.out.println("A soma entre os dois e " + (a + b));
    }
}
