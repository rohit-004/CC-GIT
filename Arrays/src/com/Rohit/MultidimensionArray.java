package com.Rohit;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int[][] arr2D = {
                {1,2,3},  //0th index
                {4,5},    //1st index
                {6,7,8,9}  //2nd index -> arr2D[2] = {6,7,8,9}
        };


        //input
        int[][] arr = new int[3][4];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
