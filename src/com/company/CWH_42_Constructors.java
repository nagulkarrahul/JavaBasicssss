package com.company;

class MyEmployee1{
    private int id;
    private String name;

    public MyEmployee1(){
         id=0;
         name="Nagulkar";
    }
    public MyEmployee1(String myName, int myID){
        id=myID;
        name=myName;
    }
    public MyEmployee1(String myName){
        id=1;
        name=myName;
    }


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

public class CWH_42_Constructors {
    public static void main(String[] args) {

        MyEmployee1 rahul= new MyEmployee1();
        //MyEmployee1 rahul= new MyEmployee1("ihsifis",4555);
        //MyEmployee1 rahul = new MyEmployee1("jhfoishoi");
        System.out.println(rahul.getId());
        System.out.println(rahul.getName());

    }
}
