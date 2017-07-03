package ru.task._2;

/* 2X
Дано четырехзначное число. Определите, является ли его десятичная запись симметричной.
Если число симметричное, то выведите 1, иначе выведите любое другое целое число.
Число может иметь меньше четырех знаков, тогда нужно считать, что его десятичная
запись дополняется слева незначащими нулями.

Входные данные
Вводится единственное число.

Выходные данные
Выведите ответ на задачу.

Примеры
входные данные
2002
выходные данные
1
*/

import java.util.Scanner;

public class X {

    // Дано четырехзначное число. Определите, является ли его десятичная запись симметричной.
    // Если число симметричное, то выведите 1, иначе выведите любое другое целое число.
    // Число может иметь меньше четырех знаков, тогда нужно считать, что его десятичная
    // запись дополняется слева незначащими нулями.
     public static String symmetryOfNumb(int n) {
        //String res = (n/1000)%100 + " " + n%100/100 + " " + (n/10)%10 + " " + n%10;
        int n0 = n%10;
        int n1 = (n/10)%10;
        int n2 = n/100%10;
        int n3 = n/1000%10;
        System.out.println("n0 " + n0);
        System.out.println("n1 " + n1);
        System.out.println("n2 " + n2);
        System.out.println("n3 " + n3);
        return (n2 == n1 && n3 == n0) ? "1" : "0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Дано четырехзначное число: ");
        int n = sc.nextInt();
        System.out.println("Если число симметричное, то выведите 1, иначе "
        + "выведите любое другое целое число: " + symmetryOfNumb(n));
    }
}