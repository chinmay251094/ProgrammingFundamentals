package edu.java.basics;

import java.util.Scanner;

public class FindSimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principle amount:: ");
		float p = sc.nextFloat();
		System.out.print("Enter time period:: ");
		int t = sc.nextInt();
		System.out.print("Enter rate of interest:: ");
		float r = sc.nextFloat();
		
		float interest = (p * t * r) / 100;
		
		System.out.println("Rate of interest is:: "+interest);
	}

}
