package com.jaybella;

/**
 * @author momondi  on 9/16/2021
 * This algorithm assumes that the first element at index 0 if sorted so we start our sort operation  from index 1( unsorted=1)
 * Remember here we dont swap elements but we shift elements after comparing with its neighbour on the left e.g unsorted<array[0]
 * alogrithm performance description is O(n^2)
 **/
public class InsertionSortAlgorithm {
    public InsertionSortAlgorithm(){

    }

public  void insertionSort(int []array){
        int newElement=0;
        for(int firstUnsortedElement=1;firstUnsortedElement<array.length; firstUnsortedElement++){

            newElement=array[firstUnsortedElement];
            int i =0;
            for(i=firstUnsortedElement; i>0 && array[i-1]>newElement;i--){
                array[i]= array[i-1];
            }
            array[i]=newElement;
        }

}



}
