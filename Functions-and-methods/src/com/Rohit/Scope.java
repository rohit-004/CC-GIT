package com.Rohit;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 78;
            int c = 30;
        }
//        System.out.println(c);

    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
