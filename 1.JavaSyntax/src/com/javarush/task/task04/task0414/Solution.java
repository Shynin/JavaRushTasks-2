package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sy = reader.readLine();
        int y = Integer.parseInt(sy);
        if (y%100 == 0 && y%400 == 0 && y%4 == 0) y = 366;
        else if (y%100 != 0 && y%400 != 0 && y%4 == 0) y = 366;
        else y = 365;
        System.out.println("количество дней в году: "+y);
    }
}