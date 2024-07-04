package com.company;

import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> mHS = new HashSet<>(5,0.5f);

        mHS.add(5);
        mHS.add(6);
        mHS.add(8);
        mHS.add(7);
        mHS.add(7);
        System.out.println(mHS);

    }
}
