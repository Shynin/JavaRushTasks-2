package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
Тимур зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name+" зарабатывает $5,000. Ха-ха-ха!");
    }
}
