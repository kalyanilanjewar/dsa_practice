// Java Program to reverse an array using Recursion

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingRecursion {
	
	//recursive function to reverse an array from left to right
	static void reverseArrayRecursion(int arr[], int left, int right)
	{
		//base condition
		if(left>=right)
			return;
		
		//swap the elements at the ends
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		//recursive call to reverse the remaining array
		reverseArrayRecursion(arr, left+1, right-1);
	}
	
	//function to reverse an array
	static void reverseArray(int arr[], int sizeOfArray)
	{
		reverseArrayRecursion(arr, 0, sizeOfArray-1);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int sizeOfArray = sc.nextInt();
		
		int arr[] = new int[sizeOfArray];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<sizeOfArray; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		reverseArray(arr, sizeOfArray); //call the function to reverse the array
		System.out.println("Reversed Array: "+Arrays.toString(arr)); //print the reversed array
		
		sc.close(); //close the scanner object to avoid resource leak
	}
}

/*
OUTPUT:
	Enter the size of array: 6
	Enter the array elements: 2 0 9 5 4 1
	Original Array: [2, 0, 9, 5, 4, 1]
	Reversed Array: [1, 4, 5, 9, 0, 2]
*/
