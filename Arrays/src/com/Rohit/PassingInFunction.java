package com.Rohit;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] str = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));

    }
    static void change(int[] arr) {
        arr[1] = 99;
    }
}
