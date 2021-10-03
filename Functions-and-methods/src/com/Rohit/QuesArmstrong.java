package com.Rohit;

import java.util.Scanner;

public class QuesArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);

        for (int i = 1; i <= n; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }

        }
    }

    static boolean isArmstrong(int v){
        int org = v;
        int sum = 0;

        while(v>0){
            int rem = v%10;
            int cube = rem * rem * rem;
            sum += cube;
            v = v/10;
        }
        return sum == org;
    }
}
