package edu.java.basics;

public class LoopsDemo {
	public static void main(String[] args) {
		LoopsDemo.whileRun(125);
	}

	static int forRun(int n)
	{
		if(n > 100)
		{
			return 0;
		}
		int i;
		for(i=1; i<n; i++)
		{
			System.out.println(i);
		}
		return i;
	}
	
	static void whileRun(int n)
	{
		int i = 1;
		if(n > 100)
		{
			System.out.println("Enter value less than 100");
		}
		else
		{
			while(i < n)
			{
				System.out.println("Chinmay");
				i++;
			}
		}
	}
}
