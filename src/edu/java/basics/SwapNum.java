package edu.java.basics;

public class SwapNum {
	public static void main(String[] args) {
		/*int x=1994;
		int y=1993;
		swap(x, y);*/
		
		//String name = "John";
		change("John");
	}
	
	static void swap(int a, int b)
	{
		System.out.println("Value before swap of a is "+a+" and b is "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Value after swap of a is "+a+" and b is "+b);
	}
	
	static void change(String naam)
	{
		naam = "Kurt";
		System.out.println(naam);
	}
}
