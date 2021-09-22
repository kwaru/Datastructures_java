package com.jaybella;

/**
 * @author momondi  on 9/15/2021
 * Defining time complexity can be estimated by number of steps we are taking.
 *
 * Bubble sort algorithms like this one has time complexity , quadratic time complexity O(n^2)
 * If you have 1 loop in your algorithm then possibly its O(n), linear.
 **/
public class BubbleSortAlgorithm {
    public BubbleSortAlgorithm(){

    }



    public void swapElements(int array[],int i , int j){
        if(i==j) // if the array indices are similar there is no need to swap
            return;

        // if they are different then we swap.
        int temp = array[i]; //put value of index i in a temporary store int temp
        array[i]= array[j];// replace content with value of index j
        array[j]=temp; // assign j value put in temp
}


public  void Sorting(int anyarray[]){
        // For the inner loop
        // inital index of last unsorted array is the last index ,the last element
    // since we are moving from right to left we decrement and start from the biggest to the largest until we reach 0, the first index
        for(int lastUnsorted = anyarray.length-1; lastUnsorted>0; lastUnsorted--){
            // For the outer loop we move the normal way comparing elements by another upto the last sorted
            for(int i =0; i<lastUnsorted;i++){
              if(anyarray[i]>anyarray[i+1])// if the previous element is bigger than next then swap them
                swapElements(anyarray,i,i+1);
            }


        }
}

}

