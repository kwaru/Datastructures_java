package com.jaybella;

import java.util.Objects;

/**
 * @author momondi  on 9/20/2021
 * A linkedList with only one link
 **/
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    public String toString(){
        return employee.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeNode)) return false;
        EmployeeNode that = (EmployeeNode) o;
        return getEmployee().equals(that.getEmployee()) && getNext().equals(that.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee(), getNext());
    }
}
