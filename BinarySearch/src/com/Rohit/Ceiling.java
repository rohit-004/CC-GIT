package com.Rohit;

import java.util.Scanner;

public class Ceiling {
        public static void main(String[] args){
            int[] x = {2,4,5,6,7,13,15,19};
            int target =12;
            int ans = ceiling(x,target);
            System.out.println(x[ans]);
        }


    static int ceiling(int[] x, int target) {
        int start = 0;
        int end = x.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < x[mid])
            {
                end = mid-1;
            }
            else if(target > x[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }

        }
        return start;
    }

}
