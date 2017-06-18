package ru.task._2;

/*
 n школьников дел€т k €блок поровну, недел€ющийс€ остаток остаетс€ в корзинке.
 —колько €блок достанетс€ каждому школьнику?
 ¬ходные данные
 ѕрограмма получает на вход числа n и k - целые, положительные, не превышают 10000.
 ¬ыходные данные
 ¬ыведите ответ на задачу.
 */

import java.util.Scanner;

public class D {

	// n школьников дел€т k €блок поровну, возвращает сколько €блок достанетс€
	// каждому школьнику.
	public static int countApple(int n, int k) {
		return k / n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число школьников n: ");
		int n = sc.nextInt();
		System.out.println("¬ведите число €блок k: ");
		int k = sc.nextInt();
		System.out.println("сколько €блок достанетс€ каждому школьнику: "
				+ countApple(n, k));
	}
}
