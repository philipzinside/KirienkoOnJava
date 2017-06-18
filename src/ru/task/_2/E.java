package ru.task._2;

/* 2E
n школьников делят k яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке? 
 Входные данные 

Программа получает на вход числа n и k - целые, положительные, не превышают 10000.
 Выходные данные 

Выведите ответ на задачу.
Примеры
Входные данные
3
14

Выходные данные
2
*/

import java.util.Scanner;

public class E {

    // n школьников делят k яблок поровну, неделящийся остаток остается в корзинке, сколько яблок останется в корзинке
    public static int countApple(int n, int k) {
        return k % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число школьников n: ");
        int n = sc.nextInt();
        System.out.println("Введите число яблок k: ");
        int k = sc.nextInt();
        System.out.println("Сколько яблок останется в корзинке: " + countApple(n, k));
    }
}
