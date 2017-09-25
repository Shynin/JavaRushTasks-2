package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(80, 1.25));
        System.out.println(convertEurToUsd(5, 1.9));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd= eur * course;
        return usd;
    }
}
