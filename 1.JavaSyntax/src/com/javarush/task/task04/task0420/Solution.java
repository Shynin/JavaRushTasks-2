package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int small = Math.min(a, Math.min(b,c));
        int big = Math.max(a, Math.max(b,c));
        int med = a+b+c-small-big;


        System.out.println(big+" "+med+" "+small);

    }
}
