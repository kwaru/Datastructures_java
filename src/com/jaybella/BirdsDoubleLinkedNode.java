package com.jaybella;

/**
 * @author momondi  on 9/21/2021
 **/
public class BirdsDoubleLinkedNode {
    private Birds birds;
    private BirdsDoubleLinkedNode previous;
    private BirdsDoubleLinkedNode next;

    public BirdsDoubleLinkedNode(Birds birds){
        this.birds = birds;
    }

    public Birds getBirds() {
        return birds;
    }

    public void setBirds(Birds birds) {
        this.birds = birds;
    }

    public BirdsDoubleLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(BirdsDoubleLinkedNode previous) {
        this.previous = previous;
    }

    public BirdsDoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(BirdsDoubleLinkedNode next) {
        this.next = next;
    }

    public String toString(){
        return birds.toString();
    }

}
