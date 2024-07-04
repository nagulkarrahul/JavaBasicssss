package com.company;

public class CWH_29_Ex06 {
    public static void main(String[] args) {
        //Que 1 - Create array of 5 floats and their sum

//        float [] arr= {10.1f,20.1f, 30.1f,40.1f,50.1f};
//        float sum=0;
//        for (float element:arr){
//            sum = sum + element;
//        }
//        System.out.println(sum);

        //Que 2 - If the value is present in the array or not.

//        float [] arr= {10.1f,20.1f, 30.1f,40.1f,50.1f};
//        float num=10.1f;
//        boolean isInArray = false;
//        for (float element:arr){
//                if (num==element){
//                    isInArray=true;
//                    break;
//                }}
//
//           if(isInArray){
//               System.out.println("Present");
//           }
//           else{
//               System.out.println("svnjksvbiksbviksbvi");
//           }


        // Que 3 - Cal. average marks of an array containing marks of all students in Physics using for each loop


//        float [] arr= {10.1f,20.1f, 30.1f,40.1f,50.1f};
//        float sum=0;
//        for (float element:arr){
//            sum = sum + element;
//        }
//        System.out.println("The value if avg marks: " + sum/arr.length);

        //Que 5 - programm to reverse an array
//
//        int [] arr ={1,2,3,4,5,6,7,8,9};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for (int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int element:arr){
//            System.out.println(element  + "");
//        }
//
        //Que 6- find maximum element in array
//
//        int [] arr ={1,2,3,4,5,6,7,8,9};
//        int max=0;
//        for (int e:arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("The value of max element is: " + max);

        // Que 8 - Check whether the array is sorted or not

            int [] arr ={1,2,103,4,5,6,7,8,9};
            boolean isSorted=true;
            for (int i=0;i<arr.length-1;i++){
                if (arr[i]>arr[i+1]){
                    isSorted=false;
                    break;
                }
            }
                if (isSorted){
                System.out.println("The array is sorted");
            }
                else{
                System.out.println("The array is not sorted");
            }


        }
    }
