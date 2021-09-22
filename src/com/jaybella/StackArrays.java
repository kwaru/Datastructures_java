package com.jaybella;

/**
 * @author momondi  on 9/22/2021
 * Stack ADT supported by array
 * Using array is great if you know the number of elements to store else use Linkedlist
 * 
 **/
public class StackArrays {
    private Employee[] stack;
    private int top;

    public StackArrays(int capacity) {

        stack = new Employee[capacity];
    }


    public void push(Employee employee) {
        // flow of pushing into the stack.
        //Check if the array stack is full (top==stack.length)
        //if its we resize the array by twice its original size
        //after this now we are positive we wont get arraIndexOutOfBound error.
        // we push the element/stack on top and increment it
        if (top == stack.length) {
            Employee[] newarray = new Employee[2 * stack.length]; // best approach is to enlarge size by 2
            System.arraycopy(stack, 0, newarray, 0, stack.length);// copy the array into new created array
            stack = newarray;// referencing the new array

        }
        stack[top++] = employee;
    }


    public Employee pop() {
        //first check if the stack is null 1-2-3-4-5
        if (stack.length == 0)
            return null;
        Employee popedEmployee = stack[--top];
        stack[top] = null;
        return popedEmployee;
    }

    public Employee peek() {
        if (stack.length == 0)
            throw new StackOverflowError();
        return stack[top-1];
    }


    //write stack is empty should return boolean
    // stack size return int size
}
