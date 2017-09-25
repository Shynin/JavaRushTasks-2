package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String when = reader.readLine();
        int nwhen = Integer.parseInt(when);
        String name = reader.readLine();

        System.out.println(name+" захватит мир через "+nwhen+" лет. Му-ха-ха!");

    }
}
