package com.jaybella;

/**
 * @author momondi  on 9/21/2021
 **/
public class BirdsDoubleLinkedList {

    private BirdsDoubleLinkedNode head;
    private  BirdsDoubleLinkedNode tail;
    private int size;



    public void addFront(Birds birds){
        // <-head->second-><-
        BirdsDoubleLinkedNode node = new BirdsDoubleLinkedNode(birds);
        node.setNext(head);

        if(head==null){
        tail= node;
        }
        else{
            head.setPrevious(node);
        }
        head = node;
        size++;
    }


    public BirdsDoubleLinkedNode removeFromEnd(){
        //null<-head-><-second-><-tail->null
        if(head==null)
            return  null;
        if(tail.getPrevious()==null){
            head=null;
        }
        BirdsDoubleLinkedNode removed=tail;
        BirdsDoubleLinkedNode previous=tail.getPrevious();

        previous.setNext(tail.getNext());
        tail=previous;
        size--;
        return  removed;
    }
    public void addBefore(BirdsDoubleLinkedNode toadd,BirdsDoubleLinkedNode existing){
       // <--head--><--second--><--third-->null
        // first check if the node is null
        // traverse the list until you reach the existing node e.g
        //check its position it can be head or tail or in between
        //
        if(head==null){
            return;
        }



        return ;
    }

public void listNodes(){
        BirdsDoubleLinkedNode current =head;
        while(current!=null){
            System.out.println(current);
            current= current.getNext();
        }
    }

}
