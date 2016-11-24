package com.zensar.sandesh.tasks;

import java.util.Arrays;

/**
 * 
 * Time complexity for this code is BIG-O-OF-N O(n) where n is the length of the input array
 * */
public class ProblemOne {

	// Can you modify to take this input from java.util.Scanner ?
	static int minRangeValue = 0, maxRangeValue = 49;
	
	public static void printArrayInRange(int a, int b)
	{
		System.out.print("[");
		for(int i = a; i<=b; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		// Can you modify to take this input from java.util.Scanner ?
		int[] inputArray = {-100, 20, 129, 22, 23, 4, 0, -56, 49, 50, 76, 8, 9};
		// You are using sort here. So, the complexity is O(n log n)
		Arrays.sort(inputArray);
		
		int temp = minRangeValue;
		for (int i=0; i<inputArray.length; i++)
		{
			if(inputArray[i] >= minRangeValue && inputArray[i] <= maxRangeValue)
			{	
				printArrayInRange(temp+1, inputArray[i]-1);
				temp = inputArray[i];
			}
		}
	}
}
