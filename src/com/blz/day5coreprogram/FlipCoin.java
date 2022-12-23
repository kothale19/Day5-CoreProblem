package com.blz.day5coreprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Welcome to Core Program!!");

		int a, b;
		System.out.println("enter the Two Number:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("Before Swapping" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping" + a + " " + b);
	}

}
