package com.blz.day5coreprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Welcome to Core Program!!");
		
		int heads = 0;
		 int tails = 0;
		 int counts = 1;
		 double random = 0.0;
		 
		 System.out.println("Enter the number:");
		 Scanner n = new Scanner(System.in);
		 int flips = n.nextInt();
		 
		 while(counts <= flips) {
			 random = Math.random();
			 System.out.println(counts+" "+random);
			 
			 if(random < 0.5) {
				 heads++;
			System.out.println("heads");
			                  }
			 
			 else {
				 tails++;
			 System.out.println("tails");
		          }
		         counts++;
		              
		                       }
	    
	     System.out.println("Number of Heads: "+heads);
	     System.out.println("Number of Tails: "+tails);
	     
	     double headPercentage = (double)heads/flips * 100;
	     double tailPercentage = (double)tails/flips * 100;
	     
	     System.out.println("Percentage of Heads: "+headPercentage+"%");
	     System.out.println("Percentage if Tails: "+tailPercentage+"%");
	     
	}

}
