package edu.java.basics;

public class LargestOfThree {
	public static void main(String[] args) {
		LargestOfThree.printLargest(23, 74, 145);
	}
	
	static void printLargest(int a, int b, int c)
	{
		int max = a;
		if(a < 0 || b < 0 || c < 0)
		{
			System.out.println("Enter a valid integer");
		}
		if(b > max)
		{
			max = b;
		}
		if(c > max)
		{
			max = c;
		}
		
		System.out.println(max);
	}
}
