package com.streamliners.task0.DecisionMakingAndLoops;

public class PrimeCheck {
    public static void main(String[] args) {
        int num= 970 , temp =0;
        for (int i=2 ; i<num ; i++)
        {
            if (num % i == 0)
            {
                temp++;
                break;
            }
        }
        if (temp==1)
            System.out.println("Composite");
        else
            System.out.println("Prime");
    }
}
