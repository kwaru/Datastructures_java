package com.jaybella;

/**
 * @author momondi  on 9/20/2021
 * A double linked list has  two links i.e a link to previuos node and link to next node
 * head node link to next node and prevoius node (which is null) , tail node has link to previous node and link to next node which
 * is also null.
 * null<---Head--->next_node_link  <---- previous node link----Tail ----->null
 **/
public class EmployeeDoubleLinkedList {
    EmployeeDoubleNode head;
    EmployeeDoubleNode tail;

    public  EmployeeDoubleLinkedList(){

    }

    public void addToEnd(Employee employee){
        //<-head-><-second -><-tail->null
        // create new node
        // newnode.previous = current tail
        //set tail to current
        EmployeeDoubleNode employeeDoubleNode = new EmployeeDoubleNode(employee);
        if(tail==null){
            head = employeeDoubleNode;
        }
        employeeDoubleNode.setPrevious(tail);
        tail.setNext(employeeDoubleNode);
        tail=employeeDoubleNode;


    }


    public EmployeeDoubleNode removeFront(){

        // null<-head-><-second-><-third
        EmployeeDoubleNode removedNode= head;
        EmployeeDoubleNode nextnode;
        if(head==null)
            return null;
        if(removedNode.getNext()==null)
            tail=null;
        nextnode= head.getNext();
        nextnode.setPrevious(null);
        head = nextnode;
        return  removedNode;
    }

    public void addToFront(Employee employee){

        //<-newhead<->head<->tail
        // check if this list had no node the we will have to set both tail and head as the current node.
        // newnode next => current headnode(head)
        // newnode prevoius if there is no Node we just leave it null
        // else if there is then the previous node

        EmployeeDoubleNode employeeDoubleNode= new EmployeeDoubleNode(employee);// create a new node to be added

        if(head==null){
            //if this is the first node in this list
            tail=employeeDoubleNode;

        }
        else {
            employeeDoubleNode.setNext(head);
            head.setPrevious(employeeDoubleNode);
        }

        head=employeeDoubleNode; // set head node be equal to the new node
    }



public void PrintEmployeeNodes(){
        EmployeeDoubleNode current=head;
//null<-head->second->third->null
        while(current!=null){
            System.out.println(current);
            current= current.getNext();
        }
}

}
