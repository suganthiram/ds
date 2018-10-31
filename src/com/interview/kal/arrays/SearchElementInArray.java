package com.interview.kal.arrays;

public class SearchElementInArray {

	
	//Given an array where difference between adjacent elements is 1, 
	// write an algorithm to search for an element in the array and 
	//return the position of the element (return the first occurrence).
	
	//Naive solution is to search every index and return the index that matches the search element
	
	//Below is Optimized search 
	public static int searchElement(int[] arr, int x){
		
		//As the difference between adjacent element in +1 or -1
		//with the above property, Math.abs(arr[i] -x) gives the closest index position to search element
		
		
		if( arr.length < 2)
			return arr[0];
		
		int i = 0;
		while ( i < arr.length){
			
			if( arr[i] == x ) {
				System.out.println("Found element at index " +  i );
				return i;
			}
			else
				i  = i + Math.abs(arr[i] - x );
		}
		return  -1;
	}
	
	public static void main(String[] args){
		 int arr[] = {8 ,7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3 }; 
		 
		 int x = 3; 
		  System.out.println("Element " + x + " is present at index "
			          + searchElement(arr,3)); 
		
	}
}
