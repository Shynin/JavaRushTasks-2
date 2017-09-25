package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);


        String[] day = {"такого дня недели не существует", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (a<1 || a>7)
            a=0;

        System.out.println(day[a]);
    }
}