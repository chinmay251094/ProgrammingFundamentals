package edu.java.basics;

import java.util.Scanner;

public class FindMinMax {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers:: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		numMinMax(a, b, c);
		
	}
	
	static void numMinMax(int a, int b, int c)
	{
		if(a > b && a > c)
		{
			if(b > c)
			{
				System.out.println(a+" is max and "+c+" is min");
			}
			else
			{
				System.out.println(a+" is max and "+b+" is min");
			}
		}
		if(b > a && b > c)
		{
			if(a > c)
			{
				System.out.println(b+" is max and "+c+" is min");
			}
			else
			{
				System.out.println(b+" is max and "+a+" is min");
			}
		}
		if(c > a && c > b)
		{
			if(a > c)
			{
				System.out.println(c+" is max and "+c+" is min");
			}
			else
			{
				System.out.println(c+" is max and "+a+" is min");
			}
		}
	}
}
