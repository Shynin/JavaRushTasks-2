package com.javarush.task.task01.task0140;

import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        System.out.println(a * a);
    }
}