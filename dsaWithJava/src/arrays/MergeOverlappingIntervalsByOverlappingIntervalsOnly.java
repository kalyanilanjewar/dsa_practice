//Write a java code to merge overlapping intervals by checking overlapping intervals only

/*steps for merge overlapping intervals
 
step1- Given set of overlapping intervals.
step2- Sort the intervlas by their starting time.
step3- add the first interval(I2) to result.
step4- since I3 overlaps with last added interval, merge them by updating ending time of last interval with max ending time.
step5- since I4 overlaps with last added interval, so merge them by updating ending time of last interval with max ending time.
step6- As I1 does not overlap with last added interval, so add it to result.
step7- we got all merged intervals in result.

*/
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervalsByOverlappingIntervalsOnly {
	
	//Function to merge overlapping intervals by checking overlapping intervals only
	static List<int[]> mergeOverlap(int[][] arr)
	{
		//Sort intervals based on start values
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> res = new ArrayList<>(); //List to store merged intervals
		res.add(new int[]{arr[0][0], arr[0][1]});
		
		for(int i=1; i<arr.length; i++)
		{
			int[] lastInterval = res.get(res.size()-1);
			int[] currentInterval = arr[i];
			
			//if current interval overlapped with last merged interval, then merge them
			if(currentInterval[0] <= lastInterval[1])
			{
				lastInterval[1] = Math.max(lastInterval[1], currentInterval[1]);
			}
			else
			{
				res.add(new int[]{currentInterval[0], currentInterval[1]});
			}
		}
		
		return res;
	}
	
	//Main function to test the code
	public static void main(String[] args)
	{
		int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
		List<int[]> res = mergeOverlap(arr); //Calling function to merge overlapping intervals by checking overlapping intervals only
		
		for(int[] interval : res)
		{
			//Print the merged intervals after merging overlapping intervals
			System.out.println(interval[0] + " " + interval[1]);
		}
	}
}

/*
OUTPUT:
	1 6
	7 8
*/