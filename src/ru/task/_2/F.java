package ru.task._2;
/* 2F
Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася 
стартует с нулевого километра МКАД и едет со скоростью v километров в час. 
На какой отметке он остановится через t часов?

Входные данные
Программа получает на вход значение v и t. Если v > 0, то Вася движется в 
положительном направлении по МКАД, если же значение v < 0, то в отрицательном. 
(Гарантируется, что исходные числа - целые и находятся в промежутке от -1000 до +1000).

Выходные данные
Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.

Примеры
входные данные
60
2
выходные данные
11
входные данные
-1
1
выходные данные
108
*/

import java.util.Scanner;
import java.lang.Math;

public class F {
    public static int lengthPoint(int v, int t, int lenth2) {
        final int LENGTH = 109;
        int s = Math.abs(v*t);
        if (v >= 0)
            lenth2 = s%109;
        else
            lenth2 = s%109==0 ? 0 : 109 - (s%109); 
        return lenth2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость байкера, v: ");
        int v = sc.nextInt();
        System.out.println("Введите время байкера, t: ");
        int t = sc.nextInt();
        int lenth2 = 0;
        System.out.println("На какой отметке он остановится через " + t + " час(-а, -ов): " + lengthPoint(v, t, lenth2));
    }
}
