package com.javarush.task.task04.task0415;

/* 
Правило треугольника
Треугольник существует.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
        if ((a+b) > c && (a+c) > b && (b+c) > a) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}