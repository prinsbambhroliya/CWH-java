package com.company;
import java.util.Scanner;

public class CWH_Ch1_Ps_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks of Subject 1 ");
        int sub1 = sc.nextInt();
        System.out.println("Enter The Marks of Subject 2 ");
        int sub2 = sc.nextInt();
        System.out.println("Enter The Marks of Subject 3 ");
        int sub3 = sc.nextInt();

        float total =sub1+sub2+sub3;
        float cgpa = (+total)/(30);
        System.out.println("Your Cgpa is : "+cgpa);
    }
}
