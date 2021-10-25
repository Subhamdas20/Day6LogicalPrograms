package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class CheckPrime {
    static int flag = 0;

    static void checkPrime(int userInput) {

        for (int i = 3; i < userInput; i++) {
            if (userInput % i == 0) {

                flag = 1;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("Not Prime number");
        } else
            System.out.println("Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int number = sc.nextInt();
        checkPrime(number);

    }
}

