package com.Rohit;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius :");
        float radius = in.nextFloat();

        float area = (22*radius*radius)/7;
        System.out.println("Area : " + area + " cm^2");
    }
}
