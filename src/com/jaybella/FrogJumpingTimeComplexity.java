package com.jaybella;

/**
 * @author momondi  on 9/16/2021
 *
 *

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:
X = 10
Y = 85
D = 30

the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100

Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.


 **/
public class FrogJumpingTimeComplexity {

    public  FrogJumpingTimeComplexity(){

    }

    /**
     *
     * @param X current frog position /starting position
     * @param D steps it can make to change position
     * @param Y Frog destination
     * @return
     */
    public int FrogJumpingSteps(int X,int D, int Y){
        int varyingJumps=0;
        if(X==Y)
        return 0;
        varyingJumps=Y-X;// subtract the constant value to get the distance it has to be covered , this is linear time complexity O(logn)

        if((varyingJumps%D)>0){
            int n = varyingJumps/D;
            return n+1; // is added if their is remainder since we have to make complete steps at all time

        }
            else{
                return varyingJumps/D;
        }

    }
}
