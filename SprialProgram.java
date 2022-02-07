package com.java.programs;

import java.util.Scanner;

public class SprialProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for sprial matrix : ");
		int input = sc.nextInt();
		
		int matrix[][] = new int[input][input];
		
		int currentNumber = 1;
		int startRow = 0;
		int startColumn = 0;
		int endRow = input-1;
		int endColumn = input-1;
		
		while( (startRow <= endRow) && (startColumn <= endColumn) ) {
			
			//Left to right
			for(int i = startColumn; i <= endColumn; i++) {
				matrix[startRow][i] = currentNumber++;
			}
			startRow++;
			
			//top to bottom
        	for(int i = startRow; i <= endRow; i++) {
               	matrix[i][endColumn]=currentNumber++;
        	}
            endColumn--;
        	
        	//right to left
        	for(int i = endColumn; i >= startColumn; i--) { 
        		matrix[endRow][i]=currentNumber++;
        	}
        	endRow--;
        	
        	//bottom to top
        	for(int i = endRow; i >= startRow; i--) {
        		matrix[i][startColumn] = currentNumber++;
        	}
        	startColumn++;
        	
		}
		
		for(int i = 0;i<input;i++) {
			for(int j = 0; j < input; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}

	}

}
