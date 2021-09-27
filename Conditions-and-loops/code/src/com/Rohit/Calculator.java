package com.Rohit;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int result = 0;
        while(true) {
            System.out.print("Enter the Operator : ");
            char ch = in.next().trim().charAt(0);
            System.out.println();
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                System.out.print("Enter Two Number : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (ch == '+') {
                    result = num1 + num2;
                }
                if (ch == '-') {
                    result = num1 - num2;
                }
                if (ch == '*') {
                    result = num1 * num2;
                }
                if (ch == '/') {
                    result = num1 / num2;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid Output");
            }
            System.out.println("Result : " + result);
        }
    }
}
