package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class CheckPerfectNumber {


    static void checkPerfectNumber(int userNumber) {
        int divisorAddition = 0;
        for (int i = 1; i < userNumber; i++) {
            if (userNumber % i == 0) {
                divisorAddition = divisorAddition + i;
            }
        }
        if (divisorAddition == userNumber) {
            System.out.println(userNumber + " is a perfect number");
        } else
            System.out.println(userNumber + " is not a perfect number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect number");
        int enteredNumber = sc.nextInt();
        checkPerfectNumber(enteredNumber);
    }
}
