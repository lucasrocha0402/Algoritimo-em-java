package org.example;

public class Passagem_De_Valor_Por_Valor_E_Referencia {
    public static int c,t1,t2;

    public static int Fibonacci(int a, int b){
        int N3 = a + b;
        System.out.print(N3 + " ");
       return N3;
    }

    public static void main(String[] args) {
        t1 = 0;
        System.out.print(t1 + " ");
        t2 = 1;
        System.out.print(t2 + " ");
        int a = t1;
        int b = t2;
        for (c = 3; c <= 10; c ++){
            int temp = Fibonacci(a, b);
            a = b;
            b = temp;
        }
    }
}
