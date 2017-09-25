package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
«Имя» получает «число1» через «число2» лет.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sn1 = reader.readLine();
        String sn2 = reader.readLine();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);

        System.out.println(name + " получает "+ n1 +" через "+ n2 +" лет.");
    }
}
