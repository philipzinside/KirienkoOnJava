package ru.task._2;

/* 2Y
Даны два натуральных числа n и m.
Если одно из них делится на другое нацело, 
выведите 1, иначе выведите любое другое целое число.

Входные данные
Вводятся два числа.

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
2
8
выходные данные
1
входные данные
8
2
выходные данные
1
входные данные
3
5
выходные данные
-5
*/

import java.util.Scanner;

public class Y {

    // одно из них делится на другое нацело,
     public static int symmetric(int n, int m) {
        return (n%m) == 0 || (m%n) == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа n и m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Ответ: " + symmetric(n,m));
    }
}