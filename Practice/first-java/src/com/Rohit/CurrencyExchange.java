package com.Rohit;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value(in Rupees) : ");
        int rupee = in.nextInt();

        double dollar = rupee / 73.757648;

        System.out.print("Dollar : $" + dollar);
    }
}
