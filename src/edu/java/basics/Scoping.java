package edu.java.basics;

public class Scoping 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		{
			a = 1000;
			int c = 25;
		}
		
		int c = 94;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}
}
