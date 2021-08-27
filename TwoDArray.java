package com.bl.java;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbe of row and column");
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] table = new int[row][column];
		System.out.println("Enter " + row * column + " element");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				table[i][j] = scan.nextInt();
				System.out.print(table[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
