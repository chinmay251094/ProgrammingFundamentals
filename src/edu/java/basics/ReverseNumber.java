package edu.java.basics;

public class ReverseNumber {
	public static void main(String[] args) {
		ReverseNumber.flipDigits(1234);
	}
	
	static void flipDigits(int n)
	{
		int rem = 0;
		int rev = 0;
		while(n > 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
