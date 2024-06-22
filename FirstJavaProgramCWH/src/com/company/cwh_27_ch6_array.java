package com.company;

public class cwh_27_ch6_array {
    public static void main(String[] args) {

        int [] marks = {23,34,54,23,45,23,45,56,76,35};
        System.out.println(marks.length);

        //Displaying the array in loop
//        System.out.println("Printing In normal Order");
//        for (int i = 0 ; i< marks.length; i++) {
//            System.out.println(i);
//        }
//
//        //Quick-Quiz Print in Reverse Order
//        System.out.println("Printing In Reverse Order");
//        for (int i = marks.length -1; i>=0 ; i--) {
//            System.out.println(marks[i]);
//        }
        System.out.println("Printing Element with 3 methods");
        for (int element: marks){
            System.out.println(element);
        }



    }


}
