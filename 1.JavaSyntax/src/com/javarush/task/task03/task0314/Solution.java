package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            int n = 1;
            while (n < 10) {
                System.out.print(i*n+" ");
                n++;
            }
            for (n=10; n<=10; n++){
                System.out.println(i*n);
            }
        }
    }
}
