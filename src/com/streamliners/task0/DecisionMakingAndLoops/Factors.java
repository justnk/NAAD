package com.streamliners.task0.DecisionMakingAndLoops;

public class Factors {
    public static void main(String[] args) {
        int num=96;
        for (int i=1 ; i<=num/2 ; i++)
        {
            if (num % i == 0)
                System.out.print(i + ", ");
        }
    }
}
