package com.streamliners.task0.Introduction;
import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The number is " + number);
    }
}
