package com.company;

public class PrintObjectType {
    public static void main(String[] args) {
        float t = 11.1f;
        System.out.println(((Object)t).getClass().getName());
    }
}
