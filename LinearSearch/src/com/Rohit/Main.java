package com.Rohit;

public class Main {

    public static void main(String[] args) {
        int[] nums = {10, 20, 3, 7, -5, 22, 12 ,-11};
        int target = 222;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    //search the target and return the index
    static int linearSearch(int[] arr, int target) {
        if(arr.length==0)
        {
           return -1;
        }

        for (int index = 0; index < arr.length; index++) {
           int element = arr[index];
           if(element==target)
           {
               return index;
           }
        }
        return -1;
    }


    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length==0)
        {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }



    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length==0)
        {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}


