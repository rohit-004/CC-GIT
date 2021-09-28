package com.Rohit;

import java.util.Scanner;

public class Num2Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Two Number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.print("Greatest : ");
        if(num1>num2)
        {
            System.out.print(num1);
        }
        else
        {
            System.out.print(num2);
        }
    }
}
