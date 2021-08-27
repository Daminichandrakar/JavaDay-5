package com.bl.java;

import java.util.Scanner;

public class VowelConstant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any Latter To Check It'S Vowel Or Constant ");
		char alphabet = scan.next().charAt(0);
		char[] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		String s = new String(ch);
		for (int i = 0; i < s.length(); i++) {
			char s1 = ch[i];

			if (s1 == alphabet) {
				System.out.println("Alphabet is vowel " + alphabet);
			}
		}
	}
}
