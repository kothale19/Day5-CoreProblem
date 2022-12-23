package com.blz.day5coreprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Welcome to Core Program!!");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("The number is even: " + num);

		} else {
			System.out.println("The number is Odd: " + num);
		}
	}

}
