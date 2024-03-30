package org.example;

public class Sequencia_de_fibonacci_com_parametro {
    public static int c,t1,t2;

    public static void Fibonacci(int[] a, int[] b){
        int temp = a[0] + b[0];
        System.out.print(temp + " ");
        a[0] = b[0];
        b[0] = temp;
    }

    public static void main(String[] args) {
        t1 = 0;
        System.out.print(t1 + " ");
        t2 = 1;
        System.out.print(t2 + " ");
        int[] a = {t1};
        int[] b = {t2};
        for (c = 3; c < 10; c ++){
            Fibonacci(a, b);
        }
    }
}
