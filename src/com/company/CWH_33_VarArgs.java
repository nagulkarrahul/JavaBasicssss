package com.company;

public class CWH_33_VarArgs {

    static int sum(int x,int ...arr){

        int result=x;
        for (int a:arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("The sum of nothing is " + sum(2));
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 is: " + sum(4,3,5));
        System.out.println("The sum of 4,3,2 and 5 is: " + sum(4,3,2,5));
    }
}
