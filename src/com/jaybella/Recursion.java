package com.jaybella;

/**
 * @author momondi  on 9/17/2021
 * A  funtion calling itself
 * 1! = 1*1,2! = 2*1, 3! = 3*2*1, 4! = 4*3*2*1
 * final analysis is =>  n! = n*(n-1)
 **/
public class Recursion {
    public Recursion(){

    }

    //apply  n! = n*(n-1)
    public  int recursiveFactorial(int num){
        if(num==0)
            return 1;
        return num*recursiveFactorial(num-1);
    }

    /**
     * Its more safer to use this method than recursion
     * @param num
     * @return
     */

    public  int factorialIterative(int num){

       if(num==0)
           return 1;

        int factorisable=1;
        for(int k =2 ;k<=num;k++)
            factorisable*=k;
           return  factorisable;
    }
}
