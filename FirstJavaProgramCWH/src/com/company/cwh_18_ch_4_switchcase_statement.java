package com.company;
import java.util.Scanner;

public class cwh_18_ch_4_switchcase_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your age:");
//        int age = sc.nextInt();
//
//        if (age>56){
//            System.out.println("You are experienced");
//        }
//        else if(age==56){
//            System.out.println("you are semi experienced");
//        }
//        else if (age>36) {
//            System.out.println("you are semi semi experienced");
//        }
//        else  {
//            System.out.println("you are not experienced");
//        }
        System.out.println("Enter The Alphabet");
        String var= sc.next();
        switch (var){
            case "a":
                System.out.println("A for Apple");
                break;
            case "b":
                System.out.println("B for Ball");
                break;
            case "c":
                System.out.println("C for Cow");
                break;
            case "d":
                System.out.println("D for Dog");
                break;
            case "e":
                System.out.println("E for Elephant");
                break;
            default:
                System.out.println("Have a nice day!");
        }
        System.out.println("Thank You For Using My Java Program");

    }
}