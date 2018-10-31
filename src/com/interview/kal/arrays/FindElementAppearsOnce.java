package com.interview.kal.arrays;

import java.util.Arrays;

public class FindElementAppearsOnce {

	//Given a sorted array, find the element that appers only once whereas other elements occurs twice
	//Find the element in O(logn) complexity
	 
	public static int search( int[] arr, int low, int high){
		
		if( arr.length  < 2 )
			return arr[0];
		
		if( low > high)
			return -1;
		
		if( low  == high) {
			System.out.println("Element that appers only once :" + arr[low]);
			return arr[low];
		}
			
		int mid  = ( low + high)/2;
		
		//When mid index is even
		if( mid%2 == 0) {
			
			if( arr[mid] == arr[mid+1])
				search ( arr, mid+2, high);
			else
				search  (arr, low, mid);
		}
		else //Mid index is odd
		{
			if( arr[mid] == arr[mid -1])
				search ( arr, mid+1, high);
			else
				search ( arr, low, mid-1);	
		}
			
		return 0;
	}
	
	public static void main(String [] args){
		
		int[] arr  = { 1,1,3,3,4,5,5,7,7,8,8};
		System.out.println(Arrays.toString(arr));
		search(arr, 0, arr.length-1);
		
		int[] arr1  = { 1,2,2,3,3};
		System.out.println(Arrays.toString(arr1));
		search(arr1, 0, arr1.length-1);
		
		int[] arr2  = { 1,1,2,2,3};  
		System.out.println(Arrays.toString(arr2));
		search(arr2, 0, arr2.length-1);
		
		int[] arr3  = { 1,1,3,3,4,4,5,7,7,8,8};
		System.out.println(Arrays.toString(arr3));
		search(arr3, 0, arr3.length-1);
		
	}
}
