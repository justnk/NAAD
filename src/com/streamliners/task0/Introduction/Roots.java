package com.streamliners.task0.Introduction;

public class Roots {
    public static void main(String[] args) {
        float a=1,b=-7,c=6,D,root1,root2;
        D = (b*b)-(4*a*c);
        root1 = (-b+D)/(2*a);
        root2 = (-b-D)/(2*a);
        System.out.println("The roots of (" + a + ")x^2 + (" + b + ")x + (" + c + ") are " + root1 + " and " + root2);
    }
}
