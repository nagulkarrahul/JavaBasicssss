package com.company;

class cylinder{

    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double sufaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int height) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class CWH_44_Ex09 {
    public static void main(String[] args) {

        // Que 1 & 2 Cylinder radius,height,surfaceArea and Volume
        //cylinder cy= new cylinder(9,12);
        //cy.setRadius(9);
        //cy.setHeight(12);
//        System.out.println(cy.getRadius());
//        System.out.println(cy.getHeight());
//        System.out.println(cy.sufaceArea());
//        System.out.println(cy.volume());

        Rectangle r = new Rectangle(12,56);
//        r.setBreadth(4);
//        r.setHeight(5);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
