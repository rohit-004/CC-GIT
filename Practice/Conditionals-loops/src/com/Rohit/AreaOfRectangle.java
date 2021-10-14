package com.Rohit;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length and width of rectangle : ");
        float s1 = in.nextFloat();
        float s2 = in.nextFloat();

        float area = (s1*s2);
        System.out.println("Area : " + area);
    }
}
