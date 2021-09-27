package com.Rohit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        for(int i=1;i<=5;i++)
//        {
//            System.out.println(i);
//        }

        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int n = in.nextInt();
//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }

//        int num = 1;
//        while(num<=5)
//        {
//            System.out.println(num);
//            num+=1;
//        }

        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=10);
    }
}
