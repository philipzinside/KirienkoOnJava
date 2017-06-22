package ru.task._2;

/* 2G
Дано натуральное число. Выведите его последнюю цифру.

Входные данные
Вводится единственное число (гарантируется, что оно не превышает 10000).

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
179
выходные данные
9
*/

import java.util.Scanner;

public class G {

    // Дано натуральное число. Возвращает его последнюю цифру
    public static int lastSymbol(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = sc.nextInt();
        System.out.println("Последняя цифра натурального числа: " + lastSymbol(n));
    }
}