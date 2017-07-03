package ru.task._2;

/* 2N
Дано число n. С начала суток прошло n минут. 
Определите, сколько часов и минут будут показывать электронные часы в этот момент.

Входные данные
Вводится число n - целое, положительное, не превышает 10^7.

Выходные данные
Программа должна вывести два числа: количество часов (от 0 до 23) и количество минут (от 0 до 59).

Учтите, что число n может быть больше, чем количество минут в сутках.

Примеры
входные данные
150
выходные данные
2 30
входные данные
1441
выходные данные
0 1
*/

import java.util.Scanner;

public class N {

    public static int numbOfHour(int n) {
        return (n / 60)%24;
    }

    public static int numbOfMin(int n) {
        return n % 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n - целое, положительное: ");
        int n = sc.nextInt();
        System.out.println("Сколько часов и минут будут показывать электронные часы в этот момент: " + 
            numbOfHour(n) + " " + numbOfMin(n));
    }
}