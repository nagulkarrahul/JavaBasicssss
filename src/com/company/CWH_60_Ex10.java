package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refilling");
    }
    public void changeLib(){
        System.out.println("Changing Lib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Bitting.....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Speaking");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

public class CWH_60_Ex10 {
    public static void main(String[] args) {
        // Que 1 and 2
//        FountainPen pen= new FountainPen();
//        pen.changeLib();
//        pen.refill();
//        pen.write();

        //Que 3 and 5
        Human obj = new Human();
        obj.eat();
        obj.sleep();
        obj.speak();
        obj.bite();

        Monkey m= new Human();
        m.bite();
        m.jump();
    }
}
