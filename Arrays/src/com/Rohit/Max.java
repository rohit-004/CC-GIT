package com.Rohit;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,10,9,4,12};
        System.out.println(maxRange(arr,1,3));
    }

    static int max(int[] arr) {
        if(arr.length==0)
        {
            return -1;
        }
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxvalue)
            {
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }



    //working on edge cases
    static int maxRange(int[] arr,int start, int end) {
        if(end>start)
        {
            return -1;
        }

        if(arr==null){
            return -1;
        }

        int maxvalue = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxvalue)
            {
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }
}
