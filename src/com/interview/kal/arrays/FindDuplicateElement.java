package com.interview.kal.arrays;


//Given an array that contains numbers from 1 to n-1 and exactly 1 duplicate, find that duplicate

public class FindDuplicateElement {
	
	public static int findDuplicateElement(int[] arr){
		
		//Formula for finding sum of 1 to n natural number is  n(n+1)/2
		// To find sum of 1 to n-1 natural numbers  =>  n-1 * (n-1+1)/2 
		//= > n*(n-1)/2 
		int sum  = 0; 
		int  n  = arr.length;
		for( int  i =0; i < n; i++){
			sum  = sum + arr[i];
		}
		
		int totalSum  = n*( n -1 )/2;
		
		int diff  = Math.abs(sum - totalSum); 
		System.out.println("number is :" + diff );
		return diff;
	}
	
	public static void main(String[] args){
	
		int a[] = {1, 5, 1, 2, 3, 4};
		findDuplicateElement(a);
	
	}
}
