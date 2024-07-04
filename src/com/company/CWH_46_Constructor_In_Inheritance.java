package com.company;

class Base1{

    Base1(){
        System.out.println("I am base class constructor");
    }
    Base1(int x){
        System.out.println("I am overloaded constructor with value of x " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am derived class constructor ");
    }
    Derived1(int x , int y){
        super(x);
        System.out.println("I am overloaded constructor from derived class with value of y " + y);
    }
}
class child extends Derived1{
    child(){
        System.out.println("I am child class constructor");
    }
    child(int x, int y, int z){
        super(x, y);
        System.out.println("I am overloaded constructor from child class with value of z " + z);
    }
}


public class CWH_46_Constructor_In_Inheritance {
    public static void main(String[] args) {

        //Base1 b = new Base1();
        //Derived1 d = new Derived1(25,26);
        child c = new child(90,100,300);


    }
}
