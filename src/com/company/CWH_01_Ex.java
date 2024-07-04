package com.company;

import java.util.Scanner;

public class CWH_01_Ex {
    public static void main(String[] args) {

        //Write a program to sum three nos in Java
        System.out.println("Sum of three nos");
        int a = 10;
        int b = 20;
        int c = 30;

        int sum = a + b + c ;

        System.out.println(sum);

        // Calculate CGPA using three subjects out of 100

        int M=45;
        int S=95;
        int P=48;

        int v = M+S+P;

        int avg =(v/3);

        int cgpa = avg/10;

        System.out.println(cgpa);

        //User Input with greets

        System.out.println(" what is your name");

        Scanner s= new Scanner(System.in);

        String s1=s.next();

        System.out.println("Good Morning" +  s1 +  "Have a great day" );

    }
}
