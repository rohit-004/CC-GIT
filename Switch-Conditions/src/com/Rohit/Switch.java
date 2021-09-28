package com.Rohit;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fruits = in.next();

//        switch (fruits){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("Sweet Red fruit");
//                break;
//            case "Banana":
//                System.out.println("Yellow Fruit");
//                break;
//            case "Grape":
//                System.out.println("Small Fruit");
//                break;
//            default:
//                System.out.println("Please Enter valid fruit");
//        }

            //Enhanced switch

//        switch (fruits) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("Sweet Red fruit");
//            case "Banana" -> System.out.println("Yellow Fruit");
//            case "Grape" -> System.out.println("Small Fruit");
//            default -> System.out.println("Please Enter valid fruit");
//        }


        int day = in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }


        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}
