package com.jaybella;
import java.util.List;

/**
 * @author momondi  on 9/18/2021
 * Difference between Vector and ArrayList is that
 * Vector are threadsafe( Synchornized) while Arralist is not synchronized meaning when using arraylist and you
 * need synchronization then you have to do it by yourself .
 * Sysnchronization => this is having one thread accessing data to do write/read operation at a given time in a higly threaed application
 * or environment to avoid data corruption errors.
 * Thread safe => A class or method or even a block of code can be accessed by multiple threads without data error occuring.
 *
 **/
public class ArrayList {

    public ArrayList(){

    }


    public void testArrayList(){
        List<Employee> employeeList = new java.util.ArrayList<>();
        List<Employee> employeeList1 = new java.util.Vector<>();
        employeeList.add(new Employee("Maurice","Omondi",10));
        employeeList.add(new Employee("Adriel","Omondi",2));
        employeeList.add(new Employee("Jack ","Willshere",4));
        employeeList.add(new Employee("David","Onyango",2));
        employeeList1.add(new Employee("Maurice","Omondi",10));
        employeeList1.add(new Employee("Adriel","Omondi",2));
        employeeList1.add(new Employee("Jack ","Willshere",4));
        employeeList1.add(new Employee("David","Onyango",2));
        employeeList.forEach(employee->System.out.println(employee));
        employeeList1.forEach(employee->System.out.println(employee));
        System.out.println(employeeList.get(1));
        System.out.println(employeeList1.get(1));

    }
}
