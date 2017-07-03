package ru.task._2;

/* 2S
Пирожок в столовой стоит a рублей и b копеек.
Определите, сколько рублей и копеек нужно заплатить за n пирожков.

Входные данные
Программа получает на вход три числа: a, b, n - целые, положительные, не превышают 10000.

Выходные данные
Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Примеры
входные данные
10
15
2
выходные данные
20 30
входные данные
2
50
4
выходные данные
10 0
*/

import java.util.Scanner;

public class S {

    // Получает стоимость в рублях и копейках за N пирожков. Возвращает стоимость в рублях и копейках за N пирожков
    public static String result(int n, int r, int k) {
        int res = numbOfKopek(n,r,k);
        return res/100 + " " + res%100;
    }

    // Получает колв-во пирожков, рублей, копеек. Возвращает сколько копеек стоят N пирожков.
    public static int numbOfKopek(int n, int r, int k) {
        return (r*100+k)*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: a, b, n - целые, положительные.");
        System.out.println("Кол-во пирожков: ");
        int n = sc.nextInt();
        System.out.println("Стоимость, рубли: ");
        int r = sc.nextInt();
        System.out.println("Стоимость, копейки: ");
        int k = sc.nextInt();
        System.out.println("Сколько рублей и копеек нужно заплатить за " + n + " " + "пирожка(-ов): " + result(n,r,k));
    }
}
