package com.company;

interface Bicycle{

    int a=78;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface EBicycle{

    void longRun();
    void batterylife();
}

class AvonBicycle implements Bicycle,EBicycle{

    void blowHorn(){
        System.out.println("Honking");
    }

    public void applyBrake(int decrement){
        System.out.println("Apply brake");
    }
    public void speedUp(int increment){
        System.out.println("Speed up");
    }
    public void longRun(){
        System.out.println("Gives best experience");
    }
    public void batterylife(){
        System.out.println("5 hours per day");
    }

}

public class CWH_55_Interfaces {
    public static void main(String[] args) {

        AvonBicycle cycle = new AvonBicycle();
        //You can create properties in interface
        //You cannot modify properties in interface as they are final

        cycle.applyBrake(5);
        cycle.blowHorn();
        cycle.speedUp(55);
        cycle.batterylife();
        cycle.longRun();
        System.out.println(cycle.a);

    }
}
