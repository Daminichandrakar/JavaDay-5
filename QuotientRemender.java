package com.bl.java;

import java.util.Scanner;

public class QuotientRemender {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to divide :- ");
		int number = scan.nextInt();
		System.out.println("Enter a number by which you divide :- ");
		int number1 = scan.nextInt();
		int quotient = number / number1;
		int remender = number % number1;
		System.out.println("Quotient is :- " + quotient);
		System.out.println("Remender is :- " + remender);
	}

}
