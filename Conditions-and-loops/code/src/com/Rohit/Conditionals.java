package com.Rohit;

public class Conditionals {

    public static void main(String[] args) {

//        int salary = 25000;
//
//        if(salary > 10000)
//        {
//            salary = salary + 2000;
//        }
//        else {
//            salary = salary + 500;
//        }
//
//        System.out.println(salary);


        int salary = 25000;

        if(salary<10000){
            salary += 1000;
        }
        else if(salary<20000){
            salary += 2000;
        }
        else {
            salary += 500;
        }

        System.out.println(salary);
    }
}
