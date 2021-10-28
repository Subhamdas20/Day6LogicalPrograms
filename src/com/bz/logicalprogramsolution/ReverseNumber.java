package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class ReverseNumber {
    /* Added method reverse to find reverse of a number */
    static void reverse(int inputNumber) {
        int reverseNumber = 0;
        while (inputNumber != 0) {
            int lastDigitOfNumber = inputNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigitOfNumber;
            inputNumber = inputNumber / 10;
        }
        System.out.println("The reversed number is " + reverseNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int userInput = sc.nextInt();
        reverse(userInput);
    }
}
