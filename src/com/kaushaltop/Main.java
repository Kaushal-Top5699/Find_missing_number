package com.kaushaltop;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a;
        int tracker = 1;
        System.out.println("Enter number of test cases: ");
        int testCases = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println("Define Array Size: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            a = new int[size];

            System.out.println("Enter array elements: ");
            for (int i=0; i<a.length; i++) {

                a[i] = scanner.nextInt();
            }

            getMissingNum(a, size);

            tracker++;

        } while (tracker <= testCases);
    }

    private static void getMissingNum(int[] a, int size) {

        int totalSum = ((size+1)*(size+2))/2;

        for(int i=0; i<a.length; i++) {

            totalSum -= a[i];
        }
        System.out.println("> "+totalSum+" is missing");
    }
}
