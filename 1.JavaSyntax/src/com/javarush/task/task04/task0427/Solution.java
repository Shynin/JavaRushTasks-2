package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>0 && a<1000) {

            if (a % 2 == 0) {
                if (a<10) System.out.println("четное однозначное число");
                else if (a<100) System.out.println("четное двузначное число");
                else if (a<1000) System.out.println("четное трехзначное число");
            }
            if (a % 2 != 0) {
                if (a<10) System.out.println("нечетное однозначное число");
                else if (a<100) System.out.println("нечетное двузначное число");
                else if (a<1000) System.out.println("нечетное трехзначное число");
            }

        }
    }
}
