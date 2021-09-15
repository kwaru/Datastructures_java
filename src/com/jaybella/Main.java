package com.jaybella;

//public class Main implements Runnable {
    //User thread created
public class Main{
    private static final Thread.State NEW = Thread.State.NEW;

    public static void main(String[] args) {
//        RotateArray rotateArray1 = new RotateArray();
     int []A = new int[]{1,4,3,3,1,4,8,9,2,8,9,10,2};
//        for(int t1: rotateArray1.solution(A,4))
//            System.out.println(t1);
        OddOcurrencesInArray oddOcurrencesInArray = new OddOcurrencesInArray();
        System.out.println(oddOcurrencesInArray.findOddocurrence(A));

    }



    }
