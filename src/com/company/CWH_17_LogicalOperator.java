package com.company;

public class CWH_17_LogicalOperator {

    public static void main(String[] args) {

        //AND operator ----- evaluates true if both the conditions are true.
//        boolean a= true;
//        boolean b= false;
//
//        if(a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        //OR operator ----- evaluates true if at least one conditions is true.

        boolean a1= false;
        boolean b1= false;

        if(a1 || b1){
            System.out.println("Y");

        }
        else{
            System.out.println("N");
        }

        //NOT Operator ---- true becomes false and false become true

        System.out.println("For Logical Not:");
        System.out.println("Not a is:");
        System.out.println(!a1);
        System.out.println("Not b is ");
        System.out.println(!b1);


    }
}
