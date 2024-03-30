package org.example;

public class Passagem_Paramatro_exemplo_soma {
    // passagem de parametro por valor. qundo eu declaro no parametro x e y. as minhas variaveis dentro do paramentro recebem o valor das variaveis que informei
    public  static int x;
    public static int y;

    public static void main(String[] args) {
        System.out.println();
        x = 5;
        y = 3;
        Soma(x,y);
    }
    public  static void Soma(int a, int b){
        System.out.println("Recebi o valor  " + a);
        System.out.println("Recebi o valor " + b);
        System.out.println("A soma entre os dois e " + (a + b));
    }
}
