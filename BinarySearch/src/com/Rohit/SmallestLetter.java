package com.Rohit;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'x';
        char ans = nextGreatestLetter2(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return letters[start % letters.length];
    }


    static char nextGreatestLetter2(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        if(start == letters.length )
        {
            return letters[0];
        }
        return letters[start];
    }
}
