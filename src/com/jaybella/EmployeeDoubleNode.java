package com.jaybella;

/**
 * @author momondi  on 9/20/2021
 **/
public class EmployeeDoubleNode {
    private Employee employee;
    private EmployeeDoubleNode next=null;
    private EmployeeDoubleNode previous=null;


    public EmployeeDoubleNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoubleNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoubleNode next) {
        this.next = next;
    }

    public EmployeeDoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoubleNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return employee.toString();
    }
}
