package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*if (a*b*c<0)System.out.println(0);
        else if (a*b>0 || a*c>0 || b*c>0) System.out.println(2);
        else if (a*b*c>0)System.out.println(3);*/

        System.out.println(plus(a)+plus(b)+plus(c));

    }
    public static Integer plus (int x){
        if (x>0) return 1;
        else return 0;
    }
}
