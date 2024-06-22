package com.company;
import java.util.Scanner;

public class ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Marks Of English Subject :");
        int sub1 = sc.nextInt();
        System.out.print("Enter The Marks Of Maths Subject :");
        int sub2 = sc.nextInt();
        System.out.print("Enter The Marks Of Science Subject :");
        int sub3 = sc.nextInt();
        System.out.print("Enter The Marks Of Gujarati Subject :");
        int sub4 = sc.nextInt();
        System.out.print("Enter The Marks Of Hindi Subject :");
        int sub5 = sc.nextInt();

        float pr = (sub1+sub2+sub3+sub4+sub5);
        float percentage = (+pr)/(5);
        System.out.print("your percentage is : ");
        System.out.println(percentage);
    }
}