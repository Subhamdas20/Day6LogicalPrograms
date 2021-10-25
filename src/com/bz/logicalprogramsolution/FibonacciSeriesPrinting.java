package com.bz.logicalprogramsolution;

public class FibonacciSeriesPrinting {

    static void fibonacciSeries(int count) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for (int i = 1; i <= count; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }

    public static void main(String[] args) {
        fibonacciSeries(10);
    }
}
