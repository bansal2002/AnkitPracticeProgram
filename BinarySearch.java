package com.java.programs;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {5,10,20,40,60};
		int left = 0;
		int right = arr.length-1;
		int value = 110;
		
		int searchIndex = search(arr,left,right,value);
		if(searchIndex>-1) {
			System.out.println("Value index is : "+searchIndex);
		}else {
			System.out.println("Value index is not available");
		}
		
	}
	
	public static int search(int arr[],int left,int right,int value) {
		
		if(right >= left) {
			int mid = (left+right)/2;
			
			if(arr[mid] == value) {
				return mid;
			}
			
			if(arr[mid]>value) {
				return search(arr,left,mid-1,value);
			}
			
			return search(arr,mid+1,right,value);
		}
		
		return -1;
	}

}
