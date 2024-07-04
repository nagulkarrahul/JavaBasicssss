package com.company;

import java.util.Scanner;

public class CWH_19_Ex04 {
    public static void main(String[] args) {


        //Que: 1
//        int a=10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

        //Que 2 : Pass or Fail
//        byte s1,s2,s3;
//        System.out.println("Please enter marks obtain s1");
//        Scanner sc= new Scanner(System.in);
//        s1 =sc.nextByte();
//
//        System.out.println("Please enter marks obtain s2");
//        s2 =sc.nextByte();
//
//        System.out.println("Please enter marks obtain s3");
//        s3 =sc.nextByte();
//
//        float avg=(s1+s2+s3)/3.0f;
//
//        System.out.println("Your overall percentage is:" + avg);
//
//        if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
//            System.out.println("Your passed");
//        }
//        else{
//            System.out.println("Your Failed");
//        }

        //Que 3 : Tax Calculations

//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter your annual income");
//        float tax=0;
//        float income=sc.nextFloat();
//
//        if(income<=2.5){
//
//            tax=tax+0;
//        } else if (income>2.5f && income <=5f ) {
//                tax = tax + 0.05f * (income-2.5f);
//
//        }
//        else if (income>5f && income<=10f) {
//
//            tax= tax + 0.2f * (5f - 2.5f);
//            tax = tax + 0.05f * (income-5f);
//
//        } else if (income>=10f) {
//
//            tax= tax + 0.2f * (10f - 5f);
//            tax = tax + 0.05f * (income-10f);
//
//        }
//        System.out.println("Total tax paid by employee is:" + tax);

        //Que 4 : Find day of week using number
//        System.out.println("Please enter number of day");
//        int day;
//        Scanner sc= new Scanner(System.in);
//        day = sc.nextInt();
//
//
//        switch (day){
//            case 1:
//            System.out.println("Monday");
//            break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wed");
//                break;
//            case 4:
//                System.out.println("Thurs");
//                break;
//            case 5:
//                System.out.println("fri");
//                break;
//            case 6:
//                System.out.println("Sat");
//                break;
//            case 7:
//                System.out.println("Sun");
//                break;
//        }


        // Que 6 : Find out type of website using url\

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter website domain");
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("It is comercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("It is organizational website");

        } else if (website.endsWith(".in")) {
            System.out.println("It is indian website");

        }


    };
}
