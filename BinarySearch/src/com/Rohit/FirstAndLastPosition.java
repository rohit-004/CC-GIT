package com.Rohit;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = findNextElement(nums,target,true);
        ans[1] = findNextElement(nums,target,false);


        return ans;
    }

    int findNextElement(int[] nums,int target,boolean findStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start  <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid])
            {
                end = mid-1;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
            }
            else
            {
                ans = mid;
                if(findStartIndex)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +   1;
                }
            }

        }
        return ans;
    }
}
