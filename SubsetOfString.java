package com.java.programs;

public class SubsetOfString {

	public static void main(String[] args) {

		String stringValue = "abcdef";
		
		int length = stringValue.length();
		String[] substringArray = new String[length*(length+1)/2];
		int temp = 0;
		for(int i = 0;i<stringValue.length();i++) {
			for(int j = i;j<stringValue.length();j++){
				substringArray[temp++] = stringValue.substring(i,j+1); 
			}
		}
		
		for(int i=0;i<substringArray.length;i++) {
			System.out.println(substringArray[i]);
		}
	}

}
