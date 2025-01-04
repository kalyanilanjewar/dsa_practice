package arrays;

public class MinMaxFinder {
	
	//Method to find the minimum element in the array
	public static int setMinValue(int[] arr, int sizeOfArray)
	{
		int minVal = Integer.MAX_VALUE;
		for(int i=0; i<sizeOfArray; i++)
		{
			if(arr[i] < minVal)
			{
				minVal = arr[i];
			}
		}
		return minVal;
	}
	
	//Method to find the maximum element in the array
	public static int setMaxValue(int[] arr, int sizeOfArray)
	{
		int maxVal = Integer.MIN_VALUE;
		for(int i=0; i<sizeOfArray; i++)
		{
			if(arr[i] > maxVal)
			{
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	public static void main(String[] args)
	{
        // Initialize an array with elements
		int[] arr = {4, 8, 10, 1, 45, 3, 91, 20};
        // Get the size of the array
		int sizeOfArray = arr.length;
        // Print the minimum element found in the array
		System.out.println("Minimum element is: "+setMinValue(arr, sizeOfArray));
        // Print the maximum element found in the array
		System.out.println("Maximum element is: "+setMaxValue(arr, sizeOfArray));
	}
}


/*
Algorithm for the MinMaxFinder program:
Step 1: Initialization
	Define a class named MinMaxFinder containing methods for finding the minimum and maximum elements of an array.
	Inside the class, define two static methods:
	setMinValue for finding the minimum value in the array.
	setMaxValue for finding the maximum value in the array.

Step 2: Method to Find Minimum Value (setMinValue)
	Accept two inputs:
	arr: An integer array containing the elements.
	sizeOfArray: The size of the array.
	Initialize a variable minVal with Integer.MAX_VALUE to hold the minimum value.
	Loop through the array:
	Start with the first element and compare it with minVal.
	If the current element is smaller than minVal, update minVal to hold this element.
	Return minVal after the loop completes.

Step 3: Method to Find Maximum Value (setMaxValue)
	Accept two inputs:
	arr: An integer array containing the elements.
	sizeOfArray: The size of the array.
	Initialize a variable maxVal with Integer.MIN_VALUE to hold the maximum value.
	Loop through the array:
	Start with the first element and compare it with maxVal.
	If the current element is larger than maxVal, update maxVal to hold this element.
	Return maxVal after the loop completes.

Step 4: Main Method
	Define the main method to execute the program.
	Initialize an array, e.g., int[] arr = {4, 8, 10, 1, 45, 3, 91, 20}.
	Calculate the size of the array using the length property: sizeOfArray = arr.length.
	Call the setMinValue method, passing the array and its size, and print the returned minimum value.
	Call the setMaxValue method, passing the array and its size, and print the returned maximum value.
	Output
	Print the minimum value found in the array:
	"Minimum element is: 1"
	Print the maximum value found in the array:
	"Maximum element is: 91"
*/



/*
Execution Flow
1. Start with the main method.
2. Initialize the array and compute its size.
3. Call setMinValue and find the minimum value.
4. Call setMaxValue and find the maximum value.
5. Print the results.
*/



/*
OUTPUT:
Minimum element is: 1
Maximum element is: 91
*/
