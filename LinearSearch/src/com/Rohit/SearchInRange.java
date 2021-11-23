package com.Rohit;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 18;
        int ans = linearSearch(nums,target,1,4);
        System.out.println(ans);
    }

    //search the target and return the index
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length==0)
        {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
