package com.company;

interface Baap{
    void m1();
    void m2();
}
interface Beta extends Baap{
    void m3();
    void m4();
}
class Ajoba implements Beta{
    public void m1(){
        System.out.println("m1");
    }  public void m2(){
        System.out.println("m2");
    }  public void m3(){
        System.out.println("m3");
    }  public void m4(){
        System.out.println("m4");
    }
}
public class CWH_58_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        Ajoba obj = new Ajoba();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
