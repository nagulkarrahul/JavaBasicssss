package com.company;

class Circle{

    public int radius;

    Circle(){
        System.out.println("I am non param constructor");
    }
    Circle(int r){
        System.out.println("I am circle param constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{

    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am Cylinder param constructor ");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;

    }
}
public class CWH_52_Ex10 {
    public static void main(String[] args) {

//        Circle obj= new Circle(12);
        Cylinder1 obj=new Cylinder1(12,10);


    }
}
