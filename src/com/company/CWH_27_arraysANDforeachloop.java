package com.company;

public class CWH_27_arraysANDforeachloop {
    public static void main(String[] args) {

        int[] marks = {11,22,33,44,55};
        System.out.println("Printing array using Naive way:");
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        int[] marks1 = {10,20,30,40,50};
        System.out.println("Printing array using for loop");
        for (int i=0; i<marks1.length;i++){
            System.out.println(marks1[i]);
        }

        int[] marks2 = {1,2,3,4,5};
        System.out.println("Printing array using enhance for loop");
        for (int j : marks2) {
            System.out.println(j);
        }

        int[] marks3 = {10,20,30,40,50};
        System.out.println("Printing array in reverse order using for loop");
        for (int i=marks3.length-1;  i>=0;i--) {
            System.out.println(marks3[i]);
        }

        int[] marks4 = {111,222,333,444,555};
        System.out.println("Printing array using for each loop");
        for (int element:marks4) {
            System.out.println(element);
        }


    }
}
