// Java Program to reverse an array by swapping elements

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayBySwappingElements {
	
	//function to reverse an array
	static void reverseArray(int arr[], int sizeOfArray)
	{
		//Iterate over the first half and for every index i,
		//swap arr[i] with arr[sizeOfArray-i-1]
		for(int i=0; i<sizeOfArray/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[sizeOfArray-i-1];
			arr[sizeOfArray-i-1] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int sizeOfArray = sc.nextInt();
		
		int arr[] = new int[sizeOfArray];
		System.out.print("Enter elements of array: ");
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
step1- Reverse the array by iterating over the first half and swapping each element with its corresponding element from the end.

step2- for i=0, swap arr[i] with arr[sizeOfArray-i-1]
		So, swap arr[0] with arr[5]

step3- for i=1, swap arr[i] with arr[sizeOfArray-i-1]
		So, swap arr[1] with arr[4]
				
step4- for i=2, swap arr[i] with arr[sizeOfArray-i-1]
		So, swap arr[2] with arr[3]
		Since we have iterated over the first half, the array is reversed.
		
step5- print the reversed array.
*/


/*OUTPUT:
	Enter size of array: 6
	Enter elements of array: 5 6 2 3 4 1
	Original Array: [5, 6, 2, 3, 4, 1]
	Reversed Array: [1, 4, 3, 2, 6, 5]
*/