package com.company;

public class CWH_25_Ex05 {

    public static void main(String[] args) {

        //Que 1 - Program to print pattern
        /* ****
         ***
         **
         *
         */

//        int n=4;
//        for (int i=n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Que 2 - First 5 even nos sum

//        int sum=0;
//        int n=5;
//        for (int i=0; i<n; i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of the even nos:");
//        System.out.print(sum);

        //Que 3 - Multiplication of given no. n
//        int n=5;
//        for(int i=1; i<=10; i++){
//            System.out.printf("%d X %dn = %d\n", n,i,n*i);
//        }

        //Que 4- Multiplication of table in reverse order

//        int n=10;
//        for(int i=10; i>=1; i--){
//            System.out.printf("%d X %dn = %d\n", n,i,n*i);
//        }

        // Que 5 -  Factorial of given no.

//        int n=5;
//        int i=1;
//        int factorial=1;
//        while (i<=n){
//            factorial *=i;
//            i++;
//        }
//        System.out.println(factorial);
//    }

        //Que 9 - Sum of nos. occuring in multiplication table of 8

        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n * i;

        }
        System.out.println(sum);
    }
}
