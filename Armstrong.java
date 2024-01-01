package com.practiceProblems.basicPrograms;

import java.util.Scanner;

public class Armstrong {
	
	public boolean isArmstrong(int number){
		int digit,noOfDigit=0,sum=0,temp;
		temp=number;
		while(temp>0) {
			temp=temp/10;
			noOfDigit++;
		}
		temp=number;
		while(temp>0) {
			digit=temp%10;
			sum+=Math.pow(digit, noOfDigit);
			temp=temp/10;
		}
		if(number==sum) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Armstrong armstrong=new Armstrong();
		System.out.println("Enter a number to check whether it is Armstrong number or not : ");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		boolean answer=armstrong.isArmstrong(number);
		if(answer==true)
			System.out.println("Given number is a Armstrong number ");
		else
			System.out.println("Given number is not a Armstrong number ");
		scanner.close();
	}
	

}
