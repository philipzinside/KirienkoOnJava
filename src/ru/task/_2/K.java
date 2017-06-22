package ru.task._2;

/* 2K
Дано целое число n. Выведите следующее за ним четное число.

Входные данные
Вводится целое положительное число, не превышающее 1000.

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
7
выходные данные
8
входные данные
8
выходные данные
10
*/

import java.util.Scanner;

public class K {

    // Дано целое число n. Возвращает следующее за ним четное число.
    public static int nextPositive(int n) {
        return n+2-n%2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число n: ");
        int n = sc.nextInt();
        System.out.println("Следующее за ним четное число: " + nextPositive(n));
    }
}