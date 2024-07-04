package com.company;


import java.util.ArrayList;

public class CWH_91_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addAll(0,l2);
        System.out.println(l1.contains(50));
        System.out.println(l1.indexOf(5));
        l1.set(1,2500000);
        l1.listIterator(0);
        l1.ensureCapacity(5);
        for(int i=0; i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }

}
