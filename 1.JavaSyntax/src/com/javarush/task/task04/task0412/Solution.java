package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();

        int a = Integer.parseInt(sa);

        if (a>0) a *= 2;
        if (a<0) a++;
        System.out.println(a);
    }

}