package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class VendingMachine {

    static int[] NOTES = { 2000, 500, 100, 50, 10, 5, 2, 1 };
    static void notes1(int value) {
        int count[] = new int[NOTES.length];
        for(int i = 0 ; i<NOTES.length ; i++) {
            if(value>=NOTES[i]) {
                count[i] = value /NOTES[i];
                value = value - (count[i]*NOTES[i]);
            }
        }
        for(int i =0 ;i<count.length ; i++) {
            System.out.println("Notes "+NOTES[i]+" " +"count "+ count[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter amoumt");
            int value = sc.nextInt();
            notes1(value);

    }
}

