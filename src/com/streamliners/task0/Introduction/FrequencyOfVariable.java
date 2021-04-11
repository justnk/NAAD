package com.streamliners.task0.Introduction;

public class FrequencyOfVariable {
    public static void main(String[] args) {
        String str= "My name is Naman Khandelwal";
        int count=0,i;
        for (i=0;i<str.length();i++)
        {
            if ('a' == str.charAt(i))
                count++;
        }
        System.out.println("a occurs " + count + " times");
    }
}
