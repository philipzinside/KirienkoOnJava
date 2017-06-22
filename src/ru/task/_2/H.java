package console;
package ru.task._2;
/* 2H
Дано двузначное число. Найдите число десятков в нем.

Входные данные
Вводится единственное число (гарантируется, что оно соответствует условию задачи).

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
42
выходные данные
4
*/

import java.util.Scanner;

public class H {

    // Дано двузначное число. Возвращает число десятков в нем.
    public static int numbOfTens(int n) {
        return n/10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число n: ");
        int n = sc.nextInt();
        System.out.println("Число десятков в двузначном числе: " + numbOfTens(n));
    }
}