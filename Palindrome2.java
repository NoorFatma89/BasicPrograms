package com.practiceProblems.basicPrograms;

import java.util.Scanner;

public class Palindrome2 {
	public static void palindrome(String number) {
		int length=number.length();
		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+number.charAt(i);
		}
		System.out.println("reverse is : "+reverse);
		if(number.equals(reverse)) 
			System.out.print("Given number is a Palindrome number");
	    else
	    	System.out.print("Given number is not a Palindrome number");
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.print("Enter a number you want to check weather it is Palindrome or not : ");
	    String number=scanner.nextLine();
	    palindrome(number);
	    scanner.close();
	}
}
