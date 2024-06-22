package com.company;
import java.util.Scanner;

public class CWH_Ch1_Ps_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number1 ");
        int a = sc.nextInt();
        System.out.println("Enter The Number2 ");
        int b = sc.nextInt();
        System.out.println("Enter The Number3 ");
        int c = sc.nextInt();

        int sum =a+b+c;
        System.out.println("Sum of 3 number is : "+sum);
    }

}
