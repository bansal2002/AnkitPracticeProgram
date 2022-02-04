package com.java.programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value : ");
        int value = input.nextInt();
        
        System.out.println(fibonacci(value-1));
	}
	
	
	
	public static int fibonacci(int value) {
		
		if(value == 0)
			return 0;
		if(value == 1)
			return 1;
		
		return fibonacci(value-1)+fibonacci(value-2);
		
	}

}
