package com.streamliners.task0.Introduction;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Nam   an          Khande  lwal";
        System.out.println("Before: " + str);
        str = str.replaceAll("\\s","");
        System.out.println("After: " + str);
    }
}
