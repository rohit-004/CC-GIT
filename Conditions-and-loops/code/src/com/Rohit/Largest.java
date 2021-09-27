package com.Rohit;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = 0;

        if(num1>=num2)
        {
            max =num1;
        }
        else
        {
            max=num2;
        }
        if(num3>max)
        {
            max=num3;
        }

        System.out.println(max);

    }
}
