package com.bz.logicalprogramsolution;

import java.util.*;

public class TemperatureConversion {
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to convert from celsius to fahrenheit.");
        System.out.println("enter 2 to convert from fahrenheit to celsius .");
        int choice = sc.nextInt();
        int temperature,result;
        if (choice == 1) {
            System.out.println("enter the temperature in celsius");
            temperature = sc.nextInt();
            result = (9 / 5 * temperature) + 32;
            System.out.println("temprature in fahrenheit:" + result);
        }

        if (choice == 2) {
            System.out.println("enter the temprature in celsius");
            temperature = sc.nextInt();
            result = (5 / 9 * temperature) + 32;
            System.out.println("temperature in celsius:" + result);
        }
    }

    public static void main(String[] args) {
        TemperatureConversion temp = new TemperatureConversion();
        temp.calculate();
    }
}
