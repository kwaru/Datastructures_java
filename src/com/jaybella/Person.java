package com.jaybella;

/**
 * @author momondi  on 9/14/2021
 **/
public class Person {
    private String name;
    private String address;
    private int age;
    private String email;

    public Person(String name, String address,int age,String email){
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
    }



    public void displayPerson(){
        System.out.println("Person name: "+name);
        System.out.println("Person address: "+address);
        System.out.println("Person age: "+age);
        System.out.println("Person email: "+email);

        System.out.println("\n");
    }



    public  String getName(){

        return name;
    }

}
