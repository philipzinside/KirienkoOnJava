package ru.task._2;

/*
 n ���������� ����� k ����� �������, ������������ ������� �������� � ��������.
 ������� ����� ���������� ������� ���������?
 ������� ������
 ��������� �������� �� ���� ����� n � k - �����, �������������, �� ��������� 10000.
 �������� ������
 �������� ����� �� ������.
 */

import java.util.Scanner;

public class D {

	// n ���������� ����� k ����� �������, ���������� ������� ����� ����������
	// ������� ���������.
	public static int countApple(int n, int k) {
		return k / n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ���������� n: ");
		int n = sc.nextInt();
		System.out.println("������� ����� ����� k: ");
		int k = sc.nextInt();
		System.out.println("������� ����� ���������� ������� ���������: "
				+ countApple(n, k));
	}
}
