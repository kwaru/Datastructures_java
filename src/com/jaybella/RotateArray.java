package com.jaybella;

/**
 * @author momondi  on 9/14/2021
 * Rotating an array of int in a number of K times
 **/
public class RotateArray {
public RotateArray(){

}

    public int[] solution(int[] A, int K)
    {
        int l =A.length;
         int []b = new int[l];

         //start the rotation K times.
        // The last digit(index n-1) should be the first

         for(int c =0; c<K; c++){
             int k=0;
             int rotate=0;

             for(rotate=0;rotate<A.length;rotate++){
// First have integer in last index to be at index 0
               if(rotate==0) {
                   b[rotate] = A[A.length -1];
               }else{
// now rotate others
                   // index 1 will be ocupied by index 0 of array A and so on  , K++
               b[rotate]= A[k];
                   k++;
               }
             } A=b.clone();// copy content of b so that we have new rotated A
         }

        return A ;
    }

}
