package edu.java.basics;

public class SalaryCalculation {

	public static void main(String[] args) {
		SalaryCalculation.getSalary("Komal", 3000);
	}
	
	public static void getSalary(String name, int sal)
	{
		if(sal <= 0)
		{
			System.out.println(name+ " your an unpaid intern");
		}
		else if(sal > 10000)
		{
			sal = sal + 2000;
			System.out.println(name+ " your salary this month is:: "+sal);
		}
		else
		{
			sal = sal + 1000;
			System.out.println(name+ " your salary this month is:: "+sal);
		}
	}
}
