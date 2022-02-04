package com.java.programs;

public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int arr[] = {10,40,15,40,11,20};
		
		int firstLargest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		if(arr.length < 2) {
			System.out.println("No second largest");
			return;
		}
		
		for(int i = 1;i<arr.length-1;i++) {
			if(arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i]>secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}

		System.out.print("Second largest : "+secondLargest);
	}

}
