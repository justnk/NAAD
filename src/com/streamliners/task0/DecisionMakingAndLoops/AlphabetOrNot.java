package com.streamliners.task0.DecisionMakingAndLoops;
import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = c.next().charAt(0);
        if (((65 <= ((int) ch)) && ((int) ch <= 90 )) || ((97 <= ((int) ch)) && ((int) ch <= 122)))
            System.out.println(ch + " is an alphabet");
        else
            System.out.println(ch + " is not an alphabet");
    }
}
