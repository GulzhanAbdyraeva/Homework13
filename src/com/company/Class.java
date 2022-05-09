package com.company;

import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int[] arr;

    public Class(){}

    public Class(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        arr = array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
