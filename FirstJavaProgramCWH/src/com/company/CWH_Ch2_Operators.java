package com.company;
import java.util.Scanner;
public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        int a = 8;
        int b = 18 % a; // modulo operator its show remainder
        int c = 8;
        c += 4; // Asiignment Operators

        System.out.println(b);
        System.out.println(c);
        System.out.println(9==5); // Comparison Operators
        System.out.println(9>4);
        System.out.println(9>4 || 8<6); //logical operators Or
        System.out.println(9>4 && 8<6); // And
        System.out.println(1&3); // bitwise operators
    }
}
