package com.jaybella;

/**
 * @author momondi  on 9/12/2021
 * Delete
 * Search
 * Insert at the head , tail and any point
 **/
public class ArrayOperations {
    private Person[] employees;
    int startIndex=0;

    public ArrayOperations(Person[] employees) {
        this.employees = employees;
    }

    public  void addEmployee(Person value){
        if(employees[0]==null){
            employees[0]=value;
        System.out.println("Employee added successfully to index 0");
        startIndex++;}
       else {
            employees[startIndex]=value;
            System.out.println("Employee added successfully to index "+startIndex);
         startIndex++;
        }

    };


}
