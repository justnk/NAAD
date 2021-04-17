package com.streamliners.task0.DecisionMakingAndLoops;

public class PrimeBtwnTwo {
    public static void main(String[] args) {
        int a=10 , b=100;
        for (int i=a ; i<=b ; i++)
        {
            int temp=0;
            for (int j=2 ; j<=i/2 ; j++)
            {
                if (i%j==0)
                {
                    temp++;
                    break;
                }
            }
            if (temp==0)
                System.out.print(i + ", ");
        }
    }
}
