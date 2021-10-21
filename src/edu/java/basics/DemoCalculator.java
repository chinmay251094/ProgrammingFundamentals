package edu.java.basics;

import java.text.DecimalFormat;

public class DemoCalculator {
	public static void main(String[] args) {
		DemoCalculator.basicCalc("div", 423, 7);
	}
	
	static void basicCalc(String func, double a, double b)
	{
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		switch (func) 
		{
			case "add": 
			{
				double c = a + b;
				System.out.println("Sum of "+a+" and "+b+" is:: "+numberFormat.format(c));
				break;
			}
			case "sub": 
			{
				double c = a - b;
				System.out.println("Subtraction of "+a+" and "+b+" is:: "+numberFormat.format(c));
				break;
			}
			case "mul": 
			{
				double c = a * b;
				System.out.println("Product of "+a+" and "+b+" is:: "+numberFormat.format(c));
				break;
			}
			case "div": 
			{
				try
				{
					double c = a / b;
					System.out.println(+a+" divided by "+b+" gives:: "+numberFormat.format(c));
				}
				catch (Exception ex)
				{
					System.out.println("Cannot divide by zero");
				}
				
				break;
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " + func);
		}
	}
}
