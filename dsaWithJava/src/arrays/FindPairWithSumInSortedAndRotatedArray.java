//Java code to check wheather any pair exist
//whose sum is equal to the given target value
package arrays;

import java.util.HashSet;

public class FindPairWithSumInSortedAndRotatedArray {
	
	static boolean pairInSortedRotated(int[] arr, int target)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			//calculate the complement that added to arr[i], equal to the target
			int complement = target - arr[i];
			
			//check if the complement exists in the set
			if(set.contains(complement))
			{
				return true;
			}
			
			//Add the current element to the set
			set.add(arr[i]);
		}
		
		//if no such pair is found
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {11, 15, 6, 8, 9, 10};
		int target = 16; // 11 + 5 = 16(sum of two pair)
		
		if(pairInSortedRotated(arr, target))
		{
			System.out.println("true -> Array has two elements with sum 16");
		}
		else
		{
			System.out.println("false -> Array does not have two elements with sum 16");
		}
	}

}


//OUTPUT:
//true -> Array has two elements with sum 16

	
/*
Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, 
the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.

Examples : 

Input: arr[] = [11, 15, 6, 8, 9, 10], target = 16
Output: true
Explanation: There is a pair (6, 10) with sum 16.


Input: arr[] = [11, 11, 15, 26, 38, 9, 10], target = 35
Output: true
Explanation: There is a pair (26, 9) with sum 35.


Input: arr[] = [9, 10, 10, 11, 15, 26, 38], target = 45
Output: false
Explanation: There is no pair with sum 45.
*/