package com.bl.java;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		double harmonic = 0.0;
		for (int i = 1; i <= number; i++) {
			harmonic = harmonic + (double) 1 / i;
			System.out.println(harmonic);
		}

	}

}
