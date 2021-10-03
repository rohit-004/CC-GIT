package com.Rohit;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String  naam = in.nextLine();
        String personal = greet(naam);
        System.out.println(personal);
//        greetings();
    }

    static void greetings(){
        System.out.println("Hello ! Have a nice day .");
    }

    static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
