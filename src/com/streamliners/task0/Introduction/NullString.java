package com.streamliners.task0.Introduction;

public class NullString {
    public static void main(String[] args) {
        String str = "";
        if (str == null)
            System.out.println("Null");
        else if (str.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("Neither");
    }
}
