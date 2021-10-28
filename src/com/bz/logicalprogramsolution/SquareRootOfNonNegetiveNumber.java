package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class SquareRootOfNonNegetiveNumber {
    /*
     *Added method to calculate roots
     */
    static void calculateRoot(int c) {
        double e = 2.71828;
        double t = 0;
        int i = 0;
        while (Math.abs(t - c / t) > e * t) {
            t = Math.sqrt(c);
            t = (c / t + t) / 2;
            i++;
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find square root");
        int userInput = sc.nextInt();
        calculateRoot(userInput);

    }
}
