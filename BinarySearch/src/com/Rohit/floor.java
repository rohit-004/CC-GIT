package com.Rohit;

public class floor {
    public static void main(String[] args) {

        int[] x = {2,4,5,6,7,13,15,19};
        int target =12;
        int ans =floor(x,target);
        System.out.println(x[ans]);
    }

    static int floor(int[] x, int target) {
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
        return end;
    }

}
