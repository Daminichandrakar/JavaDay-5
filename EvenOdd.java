package com.bl.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		if ((number % 2) == 0) {
			System.out.println("Even number" + number);
		} else {
			System.out.println("odd  number" + number);
		}
	}

}
