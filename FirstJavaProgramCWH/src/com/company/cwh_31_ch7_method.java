package com.company;

public class cwh_31_ch7_method {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    static int mySum(int a,int b){
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        System.out.println(c);
        int sum = mySum(4,6);
        System.out.println(sum);
        // Method invocation using object creation
        // by Declaring Method Static is not used
        // cwh_31_ch7_method obj = new cwh_31_ch7_method();
        // c =obj.logic(a,b);
    }
}
