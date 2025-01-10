// Java Program to reverse an array using inbuilt methods

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingInbuiltMethods {
	
	//function to reverse an array using inbuilt methods
	static void reverseArray(List<Integer> arr)
	{
		//reverse the array using Collections.reverse() method
		Collections.reverse(arr);
	}

	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));
		System.out.println("Original Array: "+arr);
		
		reverseArray(arr); //call the function to reverse the array
		System.out.println("Reversed Array: "+arr); //print the reversed array
	}
}

/*
OUTPUT:
	Original Array: [1, 4, 3, 2, 6, 5]
	Reversed Array: [5, 6, 2, 3, 4, 1]
*/