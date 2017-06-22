package ru.task._2;

/* 2I
Дано натуральное число. Найдите число десятков в его десятичной записи.

Входные данные
Вводится единственное число (гарантируется, что число не превышает 10^6).

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
179
выходные данные
7
*/

import java.util.Scanner;

public class I {

    // Дано двузначное число. Возвращает число десятков в нем.
    public static int numbOfTens(int n) {
        return (n/10)%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = sc.nextInt();
        System.out.println("Число десятков в двузначном числе: " + numbOfTens(n));
    }
}