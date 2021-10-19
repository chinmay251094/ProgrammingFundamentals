package edu.java.basics;

public class FindFibonacci {
	public static void main(String[] args) {
		FindFibonacci.printFibonacci(7);
	}
	
	static void printFibonacci(int n)
	{
		int firstNum = 0;
		int secondNum = 1;
		int resultNum = firstNum;
		
		for(int i=0; i<n; i++)
		{
			System.out.print(firstNum+" ");
			resultNum = firstNum + secondNum; 
			firstNum = secondNum; 
			secondNum = resultNum;
		}
		
	}
}
