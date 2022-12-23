package com.blz.day5coreprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Welcome to Core Program!!");

		int N;
		int p;
		int power = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = scan.nextInt();
		System.out.println("Enter the Power:");
		p = scan.nextInt();
		for (int i = 1; i <= p; i++) {

			power = N * power;
		}
		System.out.println("Power Table of 2 is:" + power);
	}

}
