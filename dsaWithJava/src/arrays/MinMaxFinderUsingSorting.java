package arrays;

import java.util.Arrays;

//One approach to find the maximum and minimum element in an array is to first sort the array in ascending order. Once the array is sorted, the first element of the array will be the minimum element and the last element of the array will be the maximum element.

/*Step-by-step approach:

Initialize an array.
Sort the array in ascending order.
The first element of the array will be the minimum element.
The last element of the array will be the maximum element.
Print the minimum and maximum element.
*/

class Pair{
	public int minVal;
	public int maxVal;
	
}
public class MinMaxFinderUsingSorting {
	
	// Function to find the minimum and maximum element in an array
	static Pair getMinMax(int arr[], int sizeOfArray)
	{
		Pair minmax = new Pair(); //creating an object of class Pair
		Arrays.sort(arr); // sorting the array in ascending order
		minmax.minVal = arr[0]; // first element of the array will be the minimum element
		minmax.maxVal = arr[sizeOfArray - 1]; // last element of the array will be the maximum element
		return minmax;
	}
	
	//main method is the entry point of the program 
	public static void main(String[] args)
	{
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int sizeOfArray = arr.length;
		Pair minmax = getMinMax(arr, sizeOfArray); //calling the function getMinMax and storing the returned value in min and max
		System.out.println("Minimum element is: "+minmax.minVal);
		System.out.println("Maximum element is: "+minmax.maxVal);
	}
}

/*
 * OUTPUT:- 
 * Minimum element is: 1 
 * Maximum element is: 3000
 */

/*
 * Time complexity: O(n log n), where n is the number of elements in the array, as we are using a sorting algorithm. 
 * Auxilary Space: is O(1), as we are not using any extra space.
 */
