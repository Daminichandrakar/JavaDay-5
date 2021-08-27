package com.bl.java;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  number :- ");
		int number = scan.nextInt();
		System.out.println("Factor of " + number + " is");
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				number /= i;
				System.out.print(i + " ");
			}
		}
	}

}
