package edu.java.basics;

public class NumberOccurrences {
	public static void main(String[] args) {
		NumberOccurrences.numberAppeared(45236555874L, 5);
	}
	
	static void numberAppeared(long num, int numCounted)
	{
		int counter = 0;
		while(num > 0)
		{
			if(num % 10 == numCounted)
			{
				counter++;
			}
			num = num/10;
		}
		System.out.println(counter);
	}
}
