package com.company;
import java.util.Scanner;


public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int mark1,mark2,mark3;
//        System.out.println("Enter The Marks Of Subject 1:");
//        mark1 = sc.nextInt();
//        System.out.println("Enter The Marks Of Subject 2:");
//        mark2 = sc.nextInt();
//        System.out.println("Enter The Marks Of Subject 3:");
//        mark3 = sc.nextInt();
//
//        float total = (mark1+mark2+mark3)/3.0f;
//        if (mark1>=33 && mark2>=33 && mark3>=33 ){
//            if (total>40){
//                System.out.println("Congratulation You Are The Passed The Exam With "+total);
//            }
//            else{
//                System.out.println("Sorry! You Are The Failed The Exam ");
//            }
//        }
//        else {
//            System.out.println("Sorry! You Are The Failed The Exam ");
//        }


        //Question -3
//        System.out.println("Enter Your Income in Lakhs Per Annum:");
//        float income = sc.nextFloat();
//        float tax = 0;
//
//        if (income<2.5f){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income<5f ) {
//            tax = tax + 0.05f * (income - 2.5f);
//
//        }
//        else if (income>5f && income<10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        }
//        else if (income >= 10f) {
//            tax = tax + 0.05f * (10.0f - 5.0f);
//            tax = tax + 0.2f * (5.0f - 2.5f);
//            tax = tax+ 0.3f * (income - 10f);
//
//        }
//        System.out.println("You Have To Paid The Total Tax Is : "+tax);

        //Question-4

//        System.out.println("Enter The Day Between (1-7):");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
//

//        //Questin-5
//        System.out.println("Enter The Year In (yyyy) Format:");
//        int year = sc.nextInt();
//        int lpy = year%4;
//        if (lpy==0){
//            System.out.println("The Year Is You Entered Is Leap Year");
//        }
//        else {
//            System.out.println("The Year You Entered Is Not Leap Year");
//        }

        //Question-6
        System.out.println("Enter The Url :");
        String url= sc.next();
        if (url.endsWith(".org")){
            System.out.println("This Is An Organization Website....");
        }
        else if (url.endsWith(".com")) {
            System.out.println("This Is A Commercial Website....");
        }
        else if (url.endsWith(".in")) {
            System.out.println("This Is An Indian Website....");
        }
        else {
            System.out.println("Enter Website is not available in database");
        }


    }
}
