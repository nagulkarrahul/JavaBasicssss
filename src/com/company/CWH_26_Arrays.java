package com.company;

public class CWH_26_Arrays {
    public static void main(String[] args) {

            int [] marks; //Declaration
            marks = new int[5]; // Memory allocation
            marks[0]=50;
            marks[1]=60;
            marks[2]=70;
            marks[3]=80;
            marks[4]=90;
            System.out.println(marks[3]);


            int[] marks1 = new int[5]; // Declaration and Memory allocation together
            marks1[0]=15;
            marks1[1]=65;
            marks1[2]=75;
            marks1[3]=85;
            marks1[4]=95;
            System.out.println(marks1[3]);

            int[] marks3 = {11,22,33,44,55};
            System.out.println(marks3[3]);



    }
}
