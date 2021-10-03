package com.Rohit;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 6, 8, 7, 9);
//        multiple(2,3,"rohit","ritik","mohit","satyam","sushant","gaurav");
        demo("rohit","ritik");
    }

    static void demo(){
        System.out.println("rohit");
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
