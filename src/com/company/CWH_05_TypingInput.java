package com.company;

import java.util.Scanner;

public class CWH_05_TypingInput {
    public static void main(String[] args) {
        System.out.println(" Taking input from user ");
        Scanner sc= new Scanner(System.in);

//        System.out.println(" Enter a num1");
//
//        int a= sc.nextInt();
//
//        System.out.println(" Enter a num2");
//
//        int b= sc.nextInt();
//
//        int sum= a+b;
//
//        System.out.println("The sum of this num is");
//
//        System.out.println(sum);
//        System.out.println("enter a num");

        boolean c1= sc.hasNextInt();
        System.out.println(c1);



    }

}
