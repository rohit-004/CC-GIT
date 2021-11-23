package com.Rohit;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 6;
        int ans = orderAgnosticsBS(arr,target);
        System.out.println(ans);
    }

    static  int orderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start  <= end){
            int mid = start + (end - start)/2;


            if(arr[mid] == target)
            {
                return mid;
            }

            if(isAsc)
            {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                start = mid + 1;
                }
            }
        }
        return -1;
    }
}
