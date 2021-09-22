package com.jaybella;

/**
 * @author momondi  on 9/17/2021
 * A modification of Insertion sort where we start shifiting and comparing with a gap greater than 1
 * The gap is calculated using knuth sequence, the gap should not be close to the lenghth of the array
 * knuth gap formulae =(3^k-1)/2, we set k based on the lenght of the array
 **/
public class ShellSortAlgorithm {
    public ShellSortAlgorithm(){

    }

    public void shellSort(int array[]){
        for(int gap = array.length/2; gap>0; gap/=2){

            for(int i =gap; i<array.length; i++){

                int newElement=array[i];
                int j =i;
                while(j>=gap && array[j-gap]>newElement){
                    array[j]=array[j-gap];
                    j-=gap;
                }
                array[j]= newElement;
            }

        }
    }
}
