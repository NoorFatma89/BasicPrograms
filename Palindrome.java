package com.practiceProblems.basicPrograms;

import java.util.Scanner;

public class Palindrome{
    public static void palindrome(int number) {
    	int sum=0,reminder;
    	int num=number;
	    while(number!=0) {
	    	reminder=number%10;
	    	sum=(sum*10)+reminder;
	    	number=number/10;
	    }
	    if (num==sum)
	    	System.out.print("Given number is a Palindrome number");
	    else
	    	System.out.print("Given number is not a Palindrome number");
    }
	public static void main(String args[]){  
		Scanner scanner=new Scanner(System.in);
	    System.out.print("Enter a number you want to check weather it is Palindrome or not : ");
	    int number=scanner.nextInt();
	    palindrome(number);
	    scanner.close();
	}  
}  
