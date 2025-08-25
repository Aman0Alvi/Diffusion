package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class App {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of steps (N): ");
        int N = in.nextInt();

        System.out.print("Enter number of trials (M): ");
        int M = in.nextInt();

        System.out.printf("%-20s %-18s %-18s %-15s%n", "Number of Steps (N)", "Trial Number (M)", "Final Position (D)", "Time Taken (micro-seconds)");

        for (int trial = 1; trial <= M; trial++) {
            int currentPosition = 0;

            long start = System.nanoTime();
            for (int step = 0; step < N; step++) {
                currentPosition += ThreadLocalRandom.current().nextBoolean() ? 1 : -1;
            }
            long elapsedNs = System.nanoTime() - start;
            long elapsedUs = TimeUnit.NANOSECONDS.toMicros(elapsedNs);

            System.out.printf("%-20d %-18d %-18d %-15d%n",
                    N, trial, currentPosition, elapsedUs);
        }

        in.close();
    }
}
