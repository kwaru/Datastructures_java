package com.jaybella;

//public class Main implements Runnable {
    //User thread created
public class Main{
    private static final Thread.State NEW = Thread.State.NEW;

    public static void main(String[] args) {
FrogJumpingTimeComplexity frogJumpingTimeComplexity = new FrogJumpingTimeComplexity();
int [] tobesorted ={20,35,-15,7,55,1,-22};
BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
bubbleSortAlgorithm.Sorting(tobesorted);
for(int T: tobesorted)
    System.out.println(T);

    }



    }
