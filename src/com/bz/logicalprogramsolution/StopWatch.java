package com.bz.logicalprogramsolution;

import java.util.Scanner;

public class StopWatch {
    /*
     *Added  methods to create a stop watch
     */
    public double startTime() {
        double start;
        System.out.println("Press 1 to start ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        start = System.currentTimeMillis();
        return start;
    }

    public double stopTime() {
        double stop;
        System.out.println("Press 2 to stop");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        stop = System.currentTimeMillis();
        return stop;
    }

    public static void main(String[] args) {
        StopWatch obj = new StopWatch();
        double y = obj.startTime();
        System.out.println("Stop watch running");
        double x = obj.stopTime();
        double timeSec = (x - y) / 1000;
        System.out.println("Time in seconds " + timeSec);

    }
}
