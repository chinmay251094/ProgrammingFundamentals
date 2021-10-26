package edu.java.basics;

import java.util.Scanner;

public class FunctionsDemo {
	public static void main(String[] args) {
		//int ans = sum(25, 10);
		//System.out.println("Ans is:: "+ans);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println(greet(name));
		System.out.println(greet("Komal"));
		System.out.println(greet("Chinmay"));
	}
	
	static String greet(String text)
	{
		return "Hello " + text;
	}
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
