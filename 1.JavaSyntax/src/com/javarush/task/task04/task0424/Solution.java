package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.lang.annotation.ElementType;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1==num2) System.out.println(3);
        else if (num1==num3) System.out.println(2);
        else if (num2==num3) System.out.println(1);
    }
}
