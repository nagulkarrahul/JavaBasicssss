package com.company;

import java.util.Scanner;

public class CHW_11_CBSE_Result {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter s1 marks: ");
        int s1=sc.nextInt();
        System.out.println(s1);

        System.out.println("Enter s2 marks: ");
        int s2=sc.nextInt();
        System.out.println(s2);

        System.out.println("Enter s3 marks: ");
        int s3=sc.nextInt();
        System.out.println(s1);

        System.out.println("Enter s4 marks: ");
        int s4=sc.nextInt();
        System.out.println(s4);

        System.out.println("Enter s5 marks: ");
        int s5=sc.nextInt();
        System.out.println(s5);

        float total = ((s1+s2+s3+s4+s5)/500f)*100;

        System.out.println("Total percentage :" );
        System.out.println(total);




    }
}
