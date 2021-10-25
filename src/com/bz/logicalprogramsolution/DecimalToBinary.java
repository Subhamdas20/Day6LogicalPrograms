package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class DecimalToBinary {
    private static void toBinary(int userInputDecimal) {
        int[] binary = new int[15];
        int elementIndex = 0;
        while (userInputDecimal > 0) {
            binary[elementIndex] = userInputDecimal % 2;
            userInputDecimal = userInputDecimal / 2;
            elementIndex = elementIndex + 1;

        }
        for (int i = elementIndex - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = sc.nextInt();
        toBinary(userInput);
    }
}
