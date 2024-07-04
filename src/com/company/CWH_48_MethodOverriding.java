package com.company;

class A{

    public int a;
    public int rn(){
        return 5;
    }
    public void meth1(){
        System.out.println("Method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("Method 1 of class B");
    }
    public void meth2(){
        System.out.println("Method 3 0f class B");
    }
}
public class CWH_48_MethodOverriding {
    public static void main(String[] args) {

        A a= new A();
        a.meth1();

        B b = new B();
        b.meth1();
        b.meth2();
    }
}
