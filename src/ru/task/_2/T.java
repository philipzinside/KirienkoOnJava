package ru.task._2;

/* 2T
Даны значения двух моментов времени, принадлежащих одним
и тем же суткам: часы, минуты и секунды для каждого из
моментов времени. Известно, что второй момент времени 
наступил не раньше первого. Определите, сколько секунд
прошло между двумя моментами времени.

Входные данные
Программа на вход получает три целых числа: 
часы, минуты, секунды, задающие первый момент времени
и три целых числа, задающих второй момент времени.

Выходные данные
Выведите число секунд между этими моментами времени.

Примеры
входные данные
1
1
1
2
2
2
выходные данные
3661
входные данные
1
2
30
1
3
20
выходные данные
50
*/

import java.util.Scanner;

public class T {

    // Дано значение первого момента времени. Возвращает число секунд первого момента времени.
     public static int fisrtPeriod (int h1, int m1, int s1) {
        return h1*3600 + m1*60 + s1;
    }

    // Дано значение второго момента времени. Возвращает число секунд второго момента времени.
    public static int secondPeriod (int h2, int m2, int s2) {
        return h2*3600 + m2*60 + s2;
    }
    
    // Принимает значение двух моментов времени. Возвращает число секунд между этими моментами времени.
    public static int result (int h1, int m1, int s1, int h2, int m2, int s2) {
        return secondPeriod(h2,m2,s2) - fisrtPeriod(h1,m1,s1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три целых числа часы, минуты, секунды, задающие первый момент времени: ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        System.out.println("И три целых числа, задающих второй момент времени: ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.println("Определите, сколько секунд прошло между двумя моментами времени: " + result(h1, m1, s1, h2, m2, s2));
    }
}