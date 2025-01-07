package arrays;

/*The idea is to divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array.
*/

public class MinMaxFinderUsingTournamentMethod {
	
	/* Class Pair is used to return two values from
     * getMinMax() */
	static class Pair
	{
		int minVal;
		int maxVal;
	}
	
	/**
     * Finds the minimum and maximum values in the given array using the tournament method.
     *
     * @param arr The array to search.
     * @param low The starting index of the array segment.
     * @param high The ending index of the array segment.
     * @return A Pair object containing the minimum and maximum values.
     */
	static Pair getMinMax(int arr[], int low, int high)
	{
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;
		
		// If there is only one element
		if(low == high)
		{
			minmax.maxVal = arr[low];
			minmax.minVal = arr[low];
			return minmax;
		}
		
		/* If there are two elements */
		if(high == low + 1)
		{
			if(arr[low] > arr[high])
			{
				minmax.maxVal = arr[low];
				minmax.minVal = arr[high];
			}
			else
			{
				minmax.maxVal = arr[high];
				minmax.minVal = arr[low];
			}
			return minmax;
		}
		
		/* If there are more than 2 elements */
		mid = (low+high)/2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid+1, high);
		
		/* compare minimums of two parts*/
		if(mml.minVal < mmr.minVal)
		{
			minmax.minVal = mml.minVal;
		}
		else
		{
			minmax.minVal = mmr.minVal;
		}
		
		/* compare maximums of two parts*/
		if(mml.maxVal > mmr.maxVal)
		{
			minmax.maxVal = mml.maxVal;
		}
		else
		{
			minmax.maxVal = mmr.maxVal;
		}
		
		return minmax;
	}
	
	/**
     * The main method to execute the program.
     * It initializes an array and finds the minimum and maximum elements in it using the tournament method.
     *
     * @param args Command line arguments (not used).
     */
	public static void main(String[] args)
	{
		int arr[] = {89, 35, 78, 123, 89, 24, 91, 767};
		int sizeOfArray = arr.length;
		Pair minmax = getMinMax(arr, 0, sizeOfArray-1);
		System.out.println("Minimum element is "+minmax.minVal);
		System.out.println("Maximum element is "+minmax.maxVal);
	}
	
}
