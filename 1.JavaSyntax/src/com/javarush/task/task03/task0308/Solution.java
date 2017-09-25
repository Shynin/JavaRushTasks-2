package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int x = 10;
        int fact = 1;
        for(int i=1; i<=x; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
