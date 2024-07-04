package com.company;

public class CWH_31_Methods {

     int logic(int x,int y){
        int z;

        if(x>y){
            z= (x+y)*2;
        }
        else{
            z=x+y;
        }
        return z;

    }

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c;

        //Method invocation using object creation
        CWH_31_Methods obj1= new CWH_31_Methods();
        c=obj1.logic(a,b);

//        c=logic(a,b);

        int a1=1;
        int b1=2;
        int c1;

        c1=obj1.logic(a1,b1);
//        c1=logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);

    }
}

