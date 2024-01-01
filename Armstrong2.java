package com.practiceProblems.basicPrograms;

import java.util.Scanner;

public class Armstrong2 {
	public boolean armstrongNumbers(int number){
		int digit=0,noOfDigit=0,sum=0,temp;
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
		Armstrong2 armstrong=new Armstrong2();
		System.out.println("Enter a limit to calculate Armstrong number : ");
		Scanner scanner=new Scanner(System.in);
		int limit=scanner.nextInt();
		System.out.println("Armstrong numbers are : ");
		for(int i=0;i<=limit;i++) {
			if((armstrong.armstrongNumbers(i)))
				System.out.print(i+ ", ");
		}
		scanner.close();
	}

}
