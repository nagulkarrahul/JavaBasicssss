package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
         name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
         id=i;
    }
}

public class CWH_40_AccessModifiers {
    public static void main(String[] args) {

        MyEmployee rahul=new MyEmployee();

        rahul.setName("Nagulkar");
        System.out.println(rahul.getName());
        rahul.setId(5564646);
        System.out.println(rahul.getId());

    }
}
