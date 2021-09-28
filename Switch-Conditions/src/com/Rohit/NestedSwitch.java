package com.Rohit;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Rohit Kandari");
                break;
            case 2:
                System.out.println("Ritik Bhateley");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("NO Department");
                }
                break;
            default:
                System.out.println("Enter valid ID number");
                }


        // Enhanced Nested Switch Case
        switch (empID) {
            case 1 -> System.out.println("Rohit Kandari");
            case 2 -> System.out.println("Ritik Bhateley");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("NO Department");
                }
            }
            default -> System.out.println("Enter valid ID number");
        }
        }
    }
