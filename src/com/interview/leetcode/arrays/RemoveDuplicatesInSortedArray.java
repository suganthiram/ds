package com.interview.leetcode.arrays;

import java.util.Arrays;

public class RemoveDuplicatesInSortedArray {
	
	
	/* https://leetcode.com/problems/remove-duplicates-from-sorted-array */
	 
	/* Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

	 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

	 Example 1:

	 Given nums = [1,1,2],

	 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

	 It doesn't matter what you leave beyond the returned length */
	
	
	 /* Time Complexity 0(n) */ 
	
	 public static int removesDuplicates(int[] array ) {
		 	
		 int len = array.length;
		 
		 //Validate array length
		 if( len == 0 )
			 return 0;
		 
		 //As the array is already sorted, compare the consecutive index 
		 //If there is duplicate, skip the value at index 
		 //else copy the value  at the index to array[j] and increment j

		 int j = 0; 
		 for( int i = 0; i < len -1; i++) {	 
			 
			 if( array[i] != array[i+1]){ 
				 array[j] =  array[i];
				 j++;
			 }
			 
			 //Copy the last index value to array
			 array[j] = array[len-1];
		 }
		 
		 System.out.println("Array values are :"+  Arrays.toString(array));
		 
		 return j+1;
	 }
	
	 
	 public static void main(String[] args) {
		 
		 int arr[]  = {0,0,1,1,1,2,2,3,3,4};
		 System.out.println("Array length :" + removesDuplicates(arr));
		 
	 }
	
}
