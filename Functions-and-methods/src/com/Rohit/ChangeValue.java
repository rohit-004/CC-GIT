package com.Rohit;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int [] num){
        num[0] = 99;
    }
}
