package arrays;

//Write a program to find the maximum element in an array

//This class contains a method to find the maximum element in an array.
public class MaxElementInArray {
	
	/* The main method to execute the program.
    * It initializes an array and finds the maximum element in it.
    */
	public static void main(String[] args)
	{
        // Initialize an array with elements
		int[] arr = {56, 90, 78, 104, 1, 3, 80};
        // Set the first element as the initial maximum value
		int max = arr[0];
		
        // Iterate through the array to find the maximum element
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
        // Print the maximum element found in the array
		System.out.println("Maximum elemet in the array is: "+ max);
	}
}

/* ALGORITHM: Find Maximum Element in Array
1. Start: Begin the program execution.
2. Input: Initialize an array arr with n elements.
3. Initialize: Set a variable max to the first element of the array: max = arr[0].
4. Iterate Through the Array: Use a loop to traverse the array starting from the first element (i = 0) to the last element (i < arr.length):
	- For each element arr[i], compare it with max.
	- If arr[i] is greater than max, update max: max = arr[i].
    1. Output the Result: After completing the loop, the variable max contains the largest element in the array.
5. Display the Result: Print the value of max.
6. End: Terminate the program.
*/


//output
//Maximum elemet in the array is: 104
