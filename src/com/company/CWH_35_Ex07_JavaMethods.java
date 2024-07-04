package com.company;

public class CWH_35_Ex07_JavaMethods {

//      static void multiplication(int n){
//
//        for (int i=1;i<=10;i++){
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//
//        static void pattern1(int n){
//            for (int i=0;i<n;i++){
//                for (int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        static int sumRec(int n){
//
//            if (n == 1){
//                return 1;
//            }
//            return n + sumRec(n-1);

//        static int fib(int n){

            /*if (n==1){
                return 0;
            }
            else if (n==2) {
                return 1;
//            }*/
//            if (n==1 || n==2){
//                return n-1;
//            }
//            else{
//                return fib(n-1) + fib(n-2);
//            }

            static int pattern1_Rec(int n) {

                if (n > 0) {
                    pattern1_Rec(n - 1);
                    for (int i = 0; i < n; i++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }

                return n;
            }
    public static void main(String[] args) {

        //Que - 1 Multiplication table of number n
       // multiplication(8);

        //Que 2 - Program using function to print * pattern
        //pattern1(10);

        //Que - 3 Write recursive function to calculate sum of first n natural nos

//        int c=sumRec(3);
//        System.out.println(c);

        //Que 5 - Write a function to print nth term of fibonacci series using recursion

//        int d=fib(5);
//        System.out.println(d);

        //Que - 8 Repeat 2 using recurssion
        int s=pattern1_Rec(5);
        System.out.println(s);



    }

}
