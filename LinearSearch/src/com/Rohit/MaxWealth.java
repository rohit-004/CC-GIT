package com.Rohit;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public int maximumWealth2(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
