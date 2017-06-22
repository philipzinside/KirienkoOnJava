package ru.task._2;

/* 2J
Дано трехзначное число. Найдите сумму его цифр.

Входные данные
Вводится целое положительное число. Гарантируется, что оно соответствует условию задачи.

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
179
выходные данные
17
*/

import java.util.Scanner;

public class J {

    // Дано трехзначное число. Возвращает сумму его цифр.
    public static int sumOfThreeDigit(int n) {
        return n/100 + (n/10)%10 + n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число n: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр трехзначного числа: " + sumOfThreeDigit(n));
    }
}