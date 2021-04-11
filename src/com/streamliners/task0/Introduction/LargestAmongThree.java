package com.streamliners.task0.Introduction;

public class LargestAmongThree {
    public static void main(String[] args) {
        int a=10,b=5,c=7;
        if (a>b)
        {
            if (a>c)
                System.out.println(a + " is largest");
            else
                System.out.println(c + " is largest");
        }
        else
        {
            if (c>b)
                System.out.println(c + " is largest");
            else
                System.out.println(b + " is largest");
        }
    }
}
