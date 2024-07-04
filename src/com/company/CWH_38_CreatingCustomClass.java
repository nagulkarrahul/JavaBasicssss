package com.company;


class Employee{
    int id;
    int salary;
    String name;

    public void getDetails(){
        System.out.println("Employee id is: " + id);
        System.out.println("Employee name is: " + name);
    }

    public int getSalary(){
//
        return salary;
    }

}

public class CWH_38_CreatingCustomClass {
    public static void main(String[] args) {
        System.out.println("The details of employee as follows: ");
        Employee rahul = new Employee();
        Employee body = new Employee();

        rahul.id=123;
        rahul.name="Nagulkar";
        rahul.salary=564644646;

        body.id=6454646;
        body.name="Sapkal";
        body.salary=64;

        rahul.getDetails();
        body.getDetails();
        int salary= rahul.getSalary();
//        int salary=body.getSalary();
        System.out.println("Rahul salary is:"+salary);

    }
}
