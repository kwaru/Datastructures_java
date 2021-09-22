package com.jaybella;

/**
 * @author momondi  on 9/16/2021
 * In selection sort algorithm we divide the array partition into sorted and unsorted .
 * We select index 0 as our start point and compare its element with other arrays from
 * index 1 all the way to the last index and we keep not of the index of the biggest value encountered e.g if
 * index 0 is greater than index 1 , then largest element is index 1 , and our comaprison key is set as index 1.
 * if we find that another index has greater value than index 1 e.g index 5 , then our seach key is index 5 and largest value
 * is index 5 then we swap index 5 with index n-1 for first loop , like wise for n-2, n -3 ,n-4 ...... till index 0 and
 * our array is sorted .
 *
 **/
public class SelectionSortAlgorithm {
    public SelectionSortAlgorithm(){

    }

    public void selectAndSort(int[] array){
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

        for(int lastUnsorted= array.length-1; lastUnsorted>0; lastUnsorted--){
            int largestId=0;// initialize largest to index 0 for every iteration
            for(int i =1;i<=lastUnsorted; i++){ // we stop at the last unsorted index
                if(array[i]>array[largestId]) // compare current value with largest id if its larger then its what we update  to largest Id and we continue looping
                    largestId=i;


            }
            // we swap largest Id after we are out ( borrowed swap function from bubblesortalgorithm class)
            bubbleSortAlgorithm.swapElements(array,largestId,lastUnsorted);


        }

    }
}
