package arrays;

/*Initialize values of min and max as minimum and maximum of the first two elements respectively. 
 * Starting from 3rd, compare each element with max and min, 
 * and change max and min accordingly (i.e., if the element is smaller than min then change min, 
 * else if the element is greater than max then change max, else ignore the element) */

public class MinMaxFinderUsingLinearSearch {
	
	/* Class Pair is used to return two values from getMinMax() */
	static class Pair
	{
		int minVal;
		int maxVal;
	}
	
	static Pair getMinMax(int arr[], int sizeOfArray)
	{
		Pair minmax = new Pair();
		int i;
		
		/*If there is only one element then return it as min and max both*/
		if(sizeOfArray == 1)
		{
			minmax.maxVal = arr[0];
			minmax.minVal = arr[0];
			return minmax;
		}
		
		/* If there are more than one elements, then initialize min and max*/
		if(arr[0] > arr[1])
		{
			minmax.maxVal = arr[0];
			minmax.minVal = arr[1];
		}
		else
		{
			minmax.maxVal = arr[1];
			minmax.minVal = arr[0];
		}
		
		//Iterate through the array and update min and max
		for(i=2; i<sizeOfArray; i++)
		{
			if(arr[i] > minmax.maxVal)
			{
				minmax.maxVal = arr[i];
			}
			else if(arr[i] < minmax.minVal)
			{
				minmax.minVal = arr[i];
			}
		}
		return minmax;
	}
	public static void main(String[] args)
	{
		int arr[] = {123, 78, 34, 888, 901, 24, 91};
		int sizeOfArray = arr.length;
		Pair minmax = getMinMax(arr, sizeOfArray);
		System.out.printf("\nMinimum element is %d", minmax.minVal);
        System.out.printf("\nMaximum element is %d", minmax.maxVal);
	}
}
