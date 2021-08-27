package com.bl.java;

import java.util.Scanner;

public class SumZero {
	static int i = 0, j = 0, k = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row and column");
		int row = scan.nextInt();
		int[] a = new int[row];
		for (i = 0; i < row; i++) {
			a[i] = scan.nextInt();
		}
		sum(a);
	}

	public static void sum(int a[]) {
		for (i = 0; i < (a.length - 2); i++) {
			for (j = i + 1; j < (a.length - 1); j++) {
				for (k = j; k < a.length; k++) {
					if ((a[i] + a[j] + a[k]) == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}

	}

}
