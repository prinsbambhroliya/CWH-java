package com.company;


public class cwh_28_ch6_multidimensional_array {
    public static void main(String[] args) {
//        int arr [][]={{90,43},{45,43},{43,45},{54,87},{65,54}};
//        System.out.println(arr[0][1]);
//
//
//        for (int []element: arr){
//            System.out.println(Arrays.toString(element));
//        }

        int [] marks; // 1-D Array
        int [][] flats; // 2-D Array
        flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        //Displaying the 2-D array in loop


//        for (int i = 0 ; i< flats.length; i++) {
//            for (int j = 0 ; j< flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

        // Other Way --> DOnt  Understand
        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}
