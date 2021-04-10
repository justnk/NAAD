package com.streamliners.task0.Introduction;
import java.util.Scanner;

public class AddIntegers {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int first = a.nextInt();
        System.out.print("Enter another integer: ");
        int second = b.nextInt();

        int sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);
    }
}
