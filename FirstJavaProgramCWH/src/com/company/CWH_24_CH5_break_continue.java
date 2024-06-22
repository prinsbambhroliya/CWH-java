package com.company;
import java.util.Scanner;


public class CWH_24_CH5_break_continue {
    public static void main(String[] args) {
        //Break With Loop
//        for (int i =0;i<5;i++){
//            System.out.print(i);
//            System.out.println("Java Is Great");
//            if (i==2){
//                System.out.println("Ending The Loop");
//                break;
//            }
//        }

        //Continue In Loop
        for (int i =0;i<5;i++){

            if (i==2){

                System.out.println("Ending The Loop");
                continue;
            }
            System.out.print(i);
            System.out.println("Java is Great");
        }



    }
}
