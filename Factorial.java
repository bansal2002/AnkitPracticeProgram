package com.java.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int value = input.nextInt();
		
        System.out.println(factorial(value));	

	}
	
	public static int factorial(int value) {
		if(value == 1)
			return value;
		
		return value * factorial(value-1);
	}

}
