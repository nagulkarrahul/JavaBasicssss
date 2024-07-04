package com.company;

import java.util.ArrayDeque;

public class CWH_93_ArrayDequeue {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();

        ad.add(45);
        ad.add(455);
        ad.add(444);
        ad.add(455);
        ad.add(48);
        ad.addFirst(111111);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.getClass());
    }
}
