package com.Rohit;

public class Overloading {
    public static void main(String[] args) {
//        fun(32);
//        fun("rohit");
        int ans = sum(3,4,5);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a+ b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);

    }
}
