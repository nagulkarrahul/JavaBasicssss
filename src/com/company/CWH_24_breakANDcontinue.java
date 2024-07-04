package com.company;

public class CWH_24_breakANDcontinue {
    public static void main(String[] args) {

//        for(int i=0; i<10;i++) {
//
//            System.out.println(i);
//            System.out.println("Java is great");
//
//            if (i == 5) {
//                System.out.println("loop ends here");
//                break;
//
//
//            }
//        }

//        for(int i=0; i<10;i++) {
//         if (i == 5) {
//                System.out.println("loop ends here");
//                continue;
//          }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }

//        int i=0;
//        while(i<10){
//            System.out.println(i);
//            i++;
//            if (i==3){
//                System.out.println("loop ends here");
//                break;
//            }
//        }

        int i=0;
        do {
            i++;
            if (i == 3) {
                System.out.println("ending loop here");
                continue;
            }
            System.out.println(i);
            System.out.println("cccc");
            }while(i<10);
            System.out.println("loop ends here");

        }
}
