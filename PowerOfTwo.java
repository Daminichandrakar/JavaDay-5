package com.bl.java;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number ");
		double number = scan.nextDouble();
		final int fixed = 31;
		if (number < fixed) {
			for (double i = 1; i <= number; i++) {
				System.out.println((int) Math.pow(2, i));
			}
		} else {
			System.out.println("this number overflow the interger");
		}
	}

}
