package com.rohit;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Typecasting
//        int num = (int)(67.69f);
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 12.63f;
        double d = 0.12345;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double;
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
