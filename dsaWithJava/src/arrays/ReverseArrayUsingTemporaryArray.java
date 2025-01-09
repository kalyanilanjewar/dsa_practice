package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Java Program to reverse an array using temporary array
public class ReverseArrayUsingTemporaryArray {

	//function to reverse Array
	static void reverseArray(int arr[], int sizeOfArray)
	{
//		int sizeOfArray = arr.length;
		
		//temporary array to store elements in reverse order
		int[] temp = new int[sizeOfArray];
		
		//copy elements from original array to temp array in reverse order
		for(int i=0; i<sizeOfArray; i++)
		{
			temp[i] = arr[sizeOfArray-i-1];
		}
		
		//copy elements back to original array
		for(int i=0; i<sizeOfArray; i++)
		{
			arr[i] = temp[i];
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array:");
		int sizeOfArray = sc.nextInt();
		
		int arr[] = new int[sizeOfArray];
		System.out.print("Enter the elements of Array: ");
		for(int i=0; i<sizeOfArray; i++)
		{
			arr[i] = sc.nextInt();
		}
//		System.out.println("Original Array: "+java.util.Arrays.toString(arr));
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		reverseArray(arr, sizeOfArray);
		System.out.println("Reversed Array: "+Arrays.toString(arr));
		
		sc.close(); //closing the scanner object to avoid resource leak
	}
}


/*The idea is to use a temporary array to store the reverse of the array.*/
//step1- Create a temporary array of the same size as the original array.
//step2- Copy all elements from original array to the temporary array in reverse order.
//step3- Copy all the elements from temporary array back to the original array.
//step4- Print the original array.
//Time Complexity: O(n), Copying elements to a new array is a linear operation.
//Auxiliary Space: O(n), as we are using an extra array to store the reversed array.


/*OUTPUT:
	Enter the size of array:6
	Enter the elements of Array: 1 4 3 2 6 5
	Original Array: [1, 4, 3, 2, 6, 5]
	Reversed Array: [5, 6, 2, 3, 4, 1]
*/
