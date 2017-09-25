package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        int y = 0;


        if (a>0) y++;
        else x++;

        if (b>0) y++;
        else x++;

        if (c>0) y++;
        else x++;

        if (x==3) System.out.println("количество положительных чисел: 0");
        else if (y==3) System.out.println("количество отрицательных чисел: 0");

        System.out.println("количество отрицательных чисел: "+x);
        System.out.println("количество положительных чисел: "+y);*/


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            int a=Integer.parseInt(reader.readLine());
            if (a > 0) x++;
            if (a < 0) y++;
        }
        System.out.println("количество положительных чисел: " + x);
        System.out.println("количество отрицательных чисел: " + y);
    }
}
