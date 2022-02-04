package com.java.programs;

public class RotateTheArray {

	public static void main(String[] args) {

         int arr[] = {1,2,3,4,5};
         int numberOfRotation = 2;
         
         rotate(arr,0,numberOfRotation-1);
         rotate(arr,numberOfRotation,arr.length-1);
         rotate(arr,0,arr.length-1);
         
         for(int value : arr) {
        	 System.out.print(value+" ");
         }
	}
	
	public static void rotate(int arr[],int left,int right) {
		while(left <= right) {
			int x = arr[left];
			arr[left] = arr[right];
			arr[right] = x;
			left++;
			right--;
		}
	}

}
