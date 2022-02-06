package com.java.programs;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int matrix1[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int matrix2[][] = {{1,2,3},{1,2,3},{1,2,3}};
		
		int multipliedMatrix[][] = new int[3][3];
		
		for(int i = 0;i < 3;i++) {
			for(int j=0;j<3;j++) {
				multipliedMatrix[i][j] = 0;
				
				for(int k = 0;k<3;k++) {
					multipliedMatrix[i][j] += matrix1[i][k]*matrix2[k][j];
				}
				
				System.out.print(multipliedMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
