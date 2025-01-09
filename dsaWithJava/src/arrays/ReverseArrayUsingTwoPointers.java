// Java Program to reverse an array using Two Pointers

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingTwoPointers {
	
	// function to reverse an array
	static void reverseArray(int arr[], int sizeOfArray)
	{
		//initialize left to the beginning and right to the end
		int left = 0;
		int right = sizeOfArray-1;
		
		//Iterate till left is less than right
		while(left < right)
		{
			//swap the elements at left and right position
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			//increment the left pointer
			left++;
			
			//decrement the right pointer
			right--;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int sizeOfArray = sc.nextInt(); // Get the size of the array from the user
		
		int[] arr = new int[sizeOfArray]; // Initialize the array with the given size
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<sizeOfArray; i++)
		{
			arr[i] = sc.nextInt(); // Input elements into the array
		}
		System.out.println("Original Array: "+Arrays.toString(arr)); // Print the original array
		
		reverseArray(arr, sizeOfArray); //call the function to reverse the array
		System.out.println("Reversed Array: "+Arrays.toString(arr)); //print the reversed array
		
		sc.close(); //close the scanner object to avoid resource leak
	}
}


/*
step1- Initalize left to the beginning of the array and right to the end of the array

step2- Swap arr[left] and arr[right], that is swap arr[0] and arr[5] 
		increment left by 1
		decrement right by 1

step3- Swap arr[left] and arr[right], that is swap arr[1] and arr[4]
		increment left by 1
		decrement right by 1

step4- Swap arr[left] and arr[right], that is swap arr[2] and arr[3]
		increment left by 1
		decrement right by 1

step5- Now, left becomes greater than right. So, the array is reversed.
*/




/*OUTPUT:
	Enter the size of Array: 6
	Enter the elements of array: 1 8 9 4 2 6
	Original Array: [1, 8, 9, 4, 2, 6]
	Reversed Array: [6, 2, 4, 9, 8, 1]
*/