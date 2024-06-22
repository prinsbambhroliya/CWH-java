package com.company;


public class cwh_29_ch6_Practice_Set {
    public static void main(String[] args) {
        // Question-1
//        float [] marks = {34.4f,45.6f,48.68f,78.7f,45.8f };
//        float sum = 0;
//        for (float element: marks){
//            sum = sum + element;
//        }
//        System.out.println("The Value Of Sum Is "+sum);


        //Question-2
        /*
        float [] marks = {34.6f,34.5f,67.8f,90.8f,89.8f,89.7f,56.8f,89.9f};
        boolean isInarray=false;
        float num = 67.8f;
        for (float element: marks){
            if (num==element){
                isInarray=true;
                break;
            }
        }
        if (isInarray == true){
            System.out.println("The Value Is Present in the array");
        }
        else {
            System.out.println("The Value Is Not Present In The Array");
        }
        */


        //Question - 3
//        float [] marks = {34.4f,45.6f,48.68f,78.7f,45.8f };
//        float sum = 0;
//        float avg = 0;
//        for (float element: marks){
//            sum = sum + element;
//            avg = sum/(marks.length);
//        }
//
//        System.out.println("The Value Of Sum Is "+sum);
//        System.out.println(avg);


        //Question - 4
        /*


        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{3,5,8},{6,3,1}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i =0;i<mat1.length;i++) { // Row Number Of Times
            for (int j = 0; j < mat1[i].length; j++) { // Column Number Of Times
                System.out.format("Setting Value For i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //  Printing the elements of 2-D Array
        for (int i =0;i<mat1.length;i++) { // Row Number Of Times
            for (int j = 0; j < mat1[i].length; j++) { // Column Number Of Times
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");//Prints A new Line
        }

         */
        //Question -5 --> Reverse The Array
        /*
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
            //a     b   temp
            //|4|   |3|     ||
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element:arr){
            System.out.print(element+ " ");
        }

         */

        //Question -6 --->Find The Max Number From The Array
//        int [] arr = {1,21,34,42,534,64,53};
//        int max = 0;
        //int max = Integer.MIN_VALUE;
//
//        for (int e:arr){
//            if (e>max){
//                max = e;
//            }
//        }
//        System.out.println(max);


        //Question -7 --->Find The Min Number From The Array
//        int [] brr = {1,21,34,42,534,-64,53};
//        int min = Integer.MAX_VALUE;
//
//        for (int e:brr){
//            if (min>e){
//                min = e;
//            }
//        }
//        System.out.println(min);

        //Question-8 -->Find Whether Array Is Sorted Or not
        boolean issorted = true;
        int [] arr = {1,2,3,4,5,6,9,8};
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                issorted = false;
                break;
            }
        }
        if (issorted){
            System.out.println("The array Is sorted");
        }
        else {
            System.out.println("The Array Is Not Sorted");
        }






















    }
}
