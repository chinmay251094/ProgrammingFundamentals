package edu.java.basics;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.println(CheckPrime.checkForPrime(45236987));
	}

	public static boolean checkForPrime(int n) 
	{
		int i = 2;
		while (i < Math.sqrt(n)) 
		{
			if (n % i == 0) 
			{
				return true;
			}
			i++;
		}
		return false;
	}
}
