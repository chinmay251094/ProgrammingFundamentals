package edu.java.basics;

public class TellCase {
	public static void main(String[] args) {
		TellCase.tellCaseOfChar("komal");
	}
	
	static void tellCaseOfChar(String str)
	{
		char ch = str.charAt(0);
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("Letter is lower case");
		}
		else
		{
			System.out.println("Letter is upper case");
		}
	}
}
