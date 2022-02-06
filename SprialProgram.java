package com.java.programs;

import java.util.Scanner;

public class SprialProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for sprial matrix : ");
		int value = sc.nextInt();
		
		int matrix[][] = new int[value][value];
		
		int counter = 1;
		int left = 0;
		int right = value-1;
		int start = 1;
		
		while(start<=value/2) {
			
			for(int i = left;i<=right;i++) {
				matrix[left][i] = counter++;
			}
			
			for(int i = left+1;i<=right;i++) {
				matrix[i][right] = counter++;
			}
			
			for(int i = right-1;i>=left;i--) {
				matrix[right][i] = counter++;
			}
			
			for(int i = right-1;i>=left+1;i--) {
				matrix[i][left] = counter++;
			}
			
			left++;
			right--;
			start++;
		}
		
		for(int i = 0;i<value;i++) {
			for(int j = 0;j<value;j++) {
				System.out.printf("%4d",matrix[i][j]);
			}
			System.out.println();
		}

	}

}
