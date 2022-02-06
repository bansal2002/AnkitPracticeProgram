package com.java.programs;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		
		String string1 = "abcdef";
		String string2 = "abcdef";
		
		if(string1.length() != string2.length()) {
			System.out.print("Strings are not anagram");
			return;
		}
		
		char arr1[] = string1.toCharArray();
		char arr2[] = string2.toCharArray();
		
		HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<string1.length();i++) {
        	map1.put(arr1[i],map1.getOrDefault(arr1[i], 0)+1);
        }
        
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<string2.length();i++) {
        	map2.put(arr2[i],map2.getOrDefault(arr2[i], 0)+1);
        }
        
        if(map1.equals(map2)) {
        	System.out.println("Strings are anagram");
        }else {
        	System.out.println("Strings are not anagram");
        }
	}

}
