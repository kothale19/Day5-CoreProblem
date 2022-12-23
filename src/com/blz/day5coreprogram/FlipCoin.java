package com.blz.day5coreprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Welcome to Core Program!!");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Alphabet:");
		char Alphabet = scan.next().charAt(0);

		switch (Alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(Alphabet + " is a Vowel");
			break;
		default:
			System.out.println(Alphabet + " is a Consanant");
		}
	}

}
