package com.company;

import java.util.Locale;

public class CWH_14_StringMethodsInJava {
    public static void main(String[] args) {

        String s="RahulNagulkar";

        int v=s.length();
        System.out.println(v);

        String ls=s.toLowerCase(Locale.ROOT);
        System.out.println(ls);

        String us=s.toUpperCase(Locale.ROOT);
        System.out.println(us);

        String nontrim="RahulNagulkaraaaaa";
        System.out.println(nontrim.trim());
        System.out.println(nontrim.substring(7));
        System.out.println(nontrim.substring(9,16));
        System.out.println(nontrim.replace('a','A'));
        System.out.println(nontrim.startsWith("Ra"));
        System.out.println(nontrim.endsWith("aa"));
        System.out.println(nontrim.charAt(12));
        System.out.println(nontrim.indexOf("N"));
        System.out.println(nontrim.lastIndexOf("a"));
        System.out.println(nontrim.lastIndexOf("a",12));
        System.out.println(nontrim.equals("RahulNagulkaraaaaa"));
        System.out.println(nontrim.equalsIgnoreCase("rahulnagulkaraaaaa"));

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \t double quote");
        System.out.println("I am escape sequence \' double quote");
        System.out.println("I am escape sequence \\ double quote");










    }
}
