package edu.java.basics;

import java.util.Scanner;

public class VotingEligibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:: ");
        int myage = sc.nextInt();
        VotingEligibility.checkEligibility(myage);
    }

    static void checkEligibility(int age)
    {
        if(age < 0)
        {
            System.out.println("Enter valid age");
        }

        if(age > 0 && age < 18)
        {
            System.out.println("You're not eligible to vote yet");
        }

        if(age >= 18 && age <= 110)
        {
            System.out.println("You are eligible to vote");
        }

        if(age > 110)
        {
            System.out.println("Enter valid age");
        }
    }
}
