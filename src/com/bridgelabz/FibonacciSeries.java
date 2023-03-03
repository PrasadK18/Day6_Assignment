package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= num; ++i) {
            System.out.print(num1 + ", ");

            int number = num1 + num2;
            num1 = num2;
            num2 = number;
        }
    }
}