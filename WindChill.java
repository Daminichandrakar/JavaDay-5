package com.bl.java;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temprature(Number Should be above 50)");
		double t = scan.nextDouble();
		System.out.println("Enter Wind Speed(Number Should be between 3 to 120)");
		double v = scan.nextDouble();
		if (t > 50 && v < 120 && v > 3) {
			double windchill = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
			System.out.println("WindChill Value :- " + windchill);
		}
	}

}
