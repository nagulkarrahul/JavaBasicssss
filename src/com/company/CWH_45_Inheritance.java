package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'am setting x in Base class:");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I'am constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.setX(45);
        System.out.println(b.getX());

        Derived d= new Derived();
        d.setY(95);
        b.setX(85);
        System.out.println(b.getX());
        System.out.println(d.getY());


    }
}
