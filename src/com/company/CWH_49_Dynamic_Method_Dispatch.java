package com.company;

class phone{

    public void showTime(){
        System.out.println("The time is 7pm");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends phone{
    public void game(){
        System.out.println("Game is onnnn....");
    }
    public void on(){
        System.out.println("SmartPhone is on....");
    }
}


public class CWH_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //phone obj= new phone();  Allowed
        //SmartPhone smp= new SmartPhone();  Allowed
        //Smartphone smp= new phone();  Not Allowed
        phone obj = new SmartPhone();
        //obj.game();
        obj.on();
        obj.showTime();
        obj.on();
    }
}
