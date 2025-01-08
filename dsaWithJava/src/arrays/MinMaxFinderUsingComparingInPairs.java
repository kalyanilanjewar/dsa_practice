package arrays;

/*The idea is that when sizeOfArray is odd then initialize min and max as the first element. If sizeOfArray is even then initialize min and max as minimum and maximum of the first two elements respectively. For the rest of the elements, pick them in pairs and compare their maximum and minimum with max and min respectively.*/ 
public class MinMaxFinderUsingComparingInPairs {
	
	//class pair is used to return two values from getMinMAx()
	static class Pair
	{
		int minVal;
		int maxVal;
	}
	
	static Pair getMinMax(int arr[], int sizeOfArray)
	{
		Pair minmax = new Pair();
		int i;
		//if the array has even number of elements then initialize the first two elements as minimum and maximum.
		if(sizeOfArray % 2 == 0)
		{
			if(arr[0] > arr[1])
			{
				minmax.maxVal = arr[0];
				minmax.minVal = arr[1];
			}
			else
			{
				minmax.minVal = arr[0];
				minmax.maxVal = arr[1];
			}
			i = 2; //set the starting index for loop
		}//if array has odd number of elements then initialize the first element as minimum and maximum.
		else
		{
			minmax.minVal = arr[0];
			minmax.maxVal = arr[0];
			i = 1; //set the starting index for loop
		}
		
		
		// In the while loop, pick the elements in pair and compare the pair with max and min so far
		while(i < sizeOfArray-1)
		{
			if(arr[i] > arr[i+1])
			{
				if(arr[i] > minmax.maxVal)
				{
					minmax.maxVal = arr[i];
				}
				if(arr[i+1] < minmax.minVal)
				{
					minmax.minVal = arr[i+1];
				}
			}
			else
			{
				if(arr[i+1] > minmax.maxVal)
				{
					minmax.maxVal = arr[i+1];
				}
				if(arr[i] < minmax.minVal)
				{
					minmax.minVal = arr[i];
				}
			}
			i += 2; //increment the index by 2 as t6wo elements are processed in loop
		}
		
		return minmax;
	}
	public static void main(String[] args)
	{
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		int sizeOfArray = arr.length;
		Pair minmax = getMinMax(arr, sizeOfArray);
		System.out.println("Minimum element is "+minmax.minVal);
		System.out.println("Maximum element is "+minmax.maxVal);
	}

}



/*
 * Time Complexity: O(n) Auxiliary Space: O(1) as no extra space was needed.
 * 
 * Number of Comparisons: The total number of comparisons: Different for even
 * and odd n, see below:
 * 
 * If n is odd: 3*(n-1)/2 //n is size of array
 * 
 * 
 * If n is even: 1 + 3*(n-2)/2 = 3n/2-2, 1 comparison for initializing min and
 * max, and 3(n-2)/2 comparisons for rest of the elements
 * 
 * 
 * The third and fourth approaches make an equal number of comparisons when n is
 * a power of 2. In general, method 4 seems to be the best. Please write
 * comments if you find any bug in the above programs/algorithms or a better way
 * to solve the same problem.
 */