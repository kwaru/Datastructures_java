package com.jaybella;

/**
 * @author momondi  on 9/20/2021
 **/
public class EmployeeSingleLinkedList {

    private  EmployeeNode head;
    private int size=0;

    public EmployeeSingleLinkedList() {

    }

    /**
     * Java program to find middle element of linked list in one pass.
     * In order to find middle element of a linked list
     * we need to find the length first but since we can only
     * traverse linked list one time, we will have to use two pointers
     * one which we will increment on each iteration while
     * other which will be incremented every second iteration.
     * So when the first pointer will point to the end of a
     * linked list, second will be pointing to the middle
     * element of a linked list
     */

    public void findMiddleElement(){
        //head -> first->second
        EmployeeNode current=head;
        EmployeeNode middle=head;
        int length=0;

        while(current.getNext()!= null){
            length++;
            if(length%2 ==0){
                middle = middle.getNext();
            }
            current = current.getNext();
        }

        if(length%2 == 1){
            middle = middle.getNext();
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : "  + middle);

    }

    public EmployeeNode find3rdNodefromTail(){
        int counter=0;
        //head->second->third->tail->null
      EmployeeNode thirdNode=head;
      EmployeeNode currentNode=head;
      if(head==null)
          return null;

      while (currentNode!=null) {

          if ((counter < 3) && (currentNode.getNext() == null))
              return null;
          counter++;
          currentNode= currentNode.getNext();
          }
        thirdNode=head;
        System.out.println("Counter"+counter);

        for(int t=0;t<(counter-3);t++){
          thirdNode=thirdNode.getNext();
      }
      System.out.println("this is the third Node in the Linked list : "+thirdNode);
      return thirdNode;
    }

    public int getSize(){
        return  size;
    }

    public void addFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;


    }

    public void removeFront(){
        // head(first) ->sec->third
        if(isEmpty())
            return;
        head = head.getNext();
        size--;


    }


    public EmployeeNode removeanywhere(EmployeeNode employeeNode){
        EmployeeNode removedNode=head;
        EmployeeNode previuosNode=head;
        //head->second->third->fourth->fifth
        if(isEmpty())
            return removedNode;

        removedNode=head;

        while(removedNode!=null){
            if(removedNode==employeeNode){
                previuosNode.setNext(employeeNode.getNext());

            }
            previuosNode=removedNode;
        }

        return  removedNode;
    }

    public void addAftercertainIndex(int position,Employee employee){
EmployeeNode newNode = new EmployeeNode(employee);
        //head->first->second->third
        //set first ->newNode previous
        //set newNode->second current
        EmployeeNode current=head;
        int counter=0;
        EmployeeNode previosNode=head;
        if(isEmpty())
            return;
        while(current.getNext()!=null){
            counter++;
            if(counter==position){
                previosNode.setNext(newNode);
                newNode.setNext(current);
                return;

            }
            previosNode= current;
            current= current.getNext();

        }



    }

    public boolean isEmpty(){
        if(head==null)
            return  true;
        return false;
    }

    public void printList(){
        EmployeeNode current =head;
        while(current!=null){
            System.out.println(current);
            current= current.getNext();
        }

    }
}
