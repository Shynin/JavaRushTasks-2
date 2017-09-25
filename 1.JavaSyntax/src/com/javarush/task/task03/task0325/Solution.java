package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
Я буду зарабатывать $n в час
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sn = reader.readLine();
        int n = Integer.parseInt(sn);

        System.out.println("Я буду зарабатывать $"+n+" в час");

    }
}
