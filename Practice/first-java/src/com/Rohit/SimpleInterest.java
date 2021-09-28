package com.Rohit;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Principle ,Rate and Time : ");
        int prin = in.nextInt();
        int rate = in.nextInt();
        int time = in.nextInt();
        int SI = 0;

        SI = (prin * rate * time) / 100;

        System.out.println("Simple Interest : " + SI);


    }
}
