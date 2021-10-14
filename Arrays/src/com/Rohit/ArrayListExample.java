package com.Rohit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(10);
//        list.add(22);
//        list.add(3333);
//        list.add(32434);
//        list.add(234432);
//        list.add(34);
//
//
////        System.out.println(list.contains(34));
//        System.out.println(list);
//        list.set(0 , 2001);
//        list.remove(2);
//        System.out.println(list);


        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
