package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWH_92_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l1.add(1);
        l1.add(2);
        l1.addFirst(15555);
        l1.addLast(1222424);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addAll(0,l2);
        l1.removeLast();
//        l1.addLast(7777777);
//        l1.addFirst(566464);
        System.out.println(l1.contains(50));
        System.out.println(l1.indexOf(5));
        l1.set(1,2500000);
        l1.listIterator(0);

        for(int i=0; i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
