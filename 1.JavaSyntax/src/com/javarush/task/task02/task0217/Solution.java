package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m4;
        if (min(a, b) < c && min(a, b) < d)
            m4 = min(a, b);
        else if (c < min(a, b) && c < d)
            m4 = c;
        else
            m4 = d;
        return m4;

    }

    public static int min(int a, int b) {
        int m2;
        if (a < b)
            m2 = a;
        else
            m2 = b;
        return m2;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}