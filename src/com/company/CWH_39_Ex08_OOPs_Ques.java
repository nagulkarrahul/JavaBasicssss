package com.company;

class Employee1{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class  CellPhone{

    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void ring(){
        System.out.println("Ring");
    }
    public void call(){
        System.out.println("Calling");
    }

}

class Square{
    int side;
    int perimeter;

    public int getSide(){
        return side * side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}

class  Tommy{

    public void Hit(){
        System.out.println("Hitting");
    }
    public void Run(){
        System.out.println("Running");
    }
    public void Fire(){
        System.out.println("Firing");
    }

}


public class CWH_39_Ex08_OOPs_Ques {

        public static void main(String[] args) {

        //Que 1 - Create a class Employee1 with given properties
//            Employee1 rahul = new Employee1();
//
//            rahul.setName("RahulNagulkar");
//            rahul.salary=646464;
//
//            System.out.println(rahul.getName());
//            System.out.println(rahul.getSalary());

            //Que 2 - Create a class cellphone with methods to print ring,vibrate,and call
//
//            CellPhone iphone15 = new CellPhone();
//
//            iphone15.call();
//            iphone15.ring();
//            iphone15.vibrate();

            //Que 3 - Calculate side and perimeter of square
//
//            Square sq= new Square();
//
//            sq.side=3;
//            System.out.println(sq.getSide());
//            System.out.println(sq.getPerimeter());

            //Que 4 - Create class Tommy, and it's method hit,run,fire

            Tommy player= new Tommy();
            player.Fire();
            player.Hit();
            player.Run();


        }
}
