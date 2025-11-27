package testing;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        // Time start
        long startTime = System.nanoTime();

        // Memory before
        Runtime runtime = Runtime.getRuntime();
        long beforeUsedMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Enter two numbers: ");
        int result = sec();

        if (result > 18) {
            System.out.println("voted.");
        } else {
            System.out.println("you aren't voter.");
        }

        // Time end
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        // Memory after
        long afterUsedMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("\n---- Program Info ----");
        System.out.println("Execution Time: " + executionTime + " nanoseconds");
        System.out.println("Memory Used Before: " + beforeUsedMemory + " bytes");
        System.out.println("Memory Used After: " + afterUsedMemory + " bytes");
        System.out.println("Memory Difference: " + (afterUsedMemory - beforeUsedMemory) + " bytes");
    }

    public static int sec() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        return a + b;
    }
}
