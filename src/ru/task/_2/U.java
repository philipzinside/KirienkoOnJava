package ru.task._2;

/* 2U
За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршут длиной m километров? 
 Входные данные 

Программа получает на вход числа n и m (целые, положительные). 
 Выходные данные 

Выведите ответ на задачу.
Примеры
Входные данные
700
750
Выходные данные
2
Входные данные
700
2100
Выходные данные
3
*/

import java.util.Scanner;
import java.math.*;


public class U {

    // За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршут длиной m километров?
     public static int dayOfFinish(int n, int m) {
        return (int) Math.ceil(((double)m)/n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральные числа n, m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("На какой день машина доползет: "
             + dayOfFinish(n, m));
    }
}