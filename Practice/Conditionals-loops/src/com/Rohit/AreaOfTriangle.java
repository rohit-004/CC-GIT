package com.Rohit;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and height of triangle : ");
        float s1 = in.nextFloat();
        float s2 = in.nextFloat();

        float area = (s1*s2)/2;
        System.out.println("Area : " + area);
    }
}
