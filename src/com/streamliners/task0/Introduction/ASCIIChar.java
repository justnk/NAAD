package com.streamliners.task0.Introduction;
import java.util.Scanner;

public class ASCIIChar {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        char ch;

        System.out.print("Enter a character: ");
        ch = a.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is " + (int) ch);
    }
}
