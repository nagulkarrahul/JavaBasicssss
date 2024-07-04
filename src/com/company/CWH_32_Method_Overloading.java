package com.company;

public class CWH_32_Method_Overloading {

    static void ovr(){
        System.out.println("Congratulations Rahul you have iphone 15 now");
    }

    static void ovr(int a){
        System.out.println("Congratulations Rahul you have iphone 15 worth Rs: " + a);
    }

    static void change(int a){
        a=45;
    }

    static void change2(int[] arr){
        arr[0]=89;
    }

//    static void telljoke(){
//        System.out.println("I bought new iphone");
//    }

    public static void main(String[] args) {
        //telljoke();

        int [] marks={50,60,70,80,90,};

        //Case 1 - Changing the integer
//
//        int x=98;
//        change(x);
//        System.out.println("Print the changed value:" + x);

//        //Case 2 - Changing the array
//        change2(marks);
//        System.out.println("Print the changed array: " + marks[0]);

        ovr();
        ovr(70000);



    }


}
