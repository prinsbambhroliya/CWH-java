package com.company;
import java.util.Scanner;

public class cwh_16_ch_4_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        boolean cond = (age>=18);
        if (cond){
            System.out.println("Yes You Can Drive");
        }
        else {
            System.out.println("sorry, You Can Not Drive");
        }
    }
}
