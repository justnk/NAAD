package com.streamliners.task0.DecisionMakingAndLoops;
import java.util.Scanner;

public class NoOfDigitInt {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int count=0;

        System.out.print("Enter an integer: ");
        int number = a.nextInt();

        while (number != 0)
        {
            number = number/10;
            count++;
        }
        System.out.println("No. of digits in " + number + " = " + count);
    }
}
