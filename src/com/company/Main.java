package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class class1 = new Class(24,"apple",new int[]{2,3,5,7});

        System.out.println(class1.getNumber());

        System.out.println(class1.getWord());

        for (int a : class1.getArr()) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(class1.toString());
    }
}