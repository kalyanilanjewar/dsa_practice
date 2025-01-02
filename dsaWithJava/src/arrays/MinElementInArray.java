package arrays;

//Write a program to find the minimum element in an array
public class MinElementInArray {
	
	public static void main(String[] args) {
		int[] arr = { 5, 8, 9, 3, 1, 2, 6 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum element in the array is: " + min);
	}

}

/*
Algorithm: Find Minimum Element in Array
step1-Start
	Begin the program execution.

step2-Input
	Initialize an array arr with n elements.
	Example: arr = {5, 8, 9, 3, 1, 2, 6}.

step3-Initialize
	Set a variable min to the first element of the array:
	min = arr[0].
	
step4-Iterate Through the Array
	Use a loop to traverse the array starting from the second element (i = 1) to the last element (i < arr.length):
		For each element arr[i], compare it with min.
		If arr[i] is smaller than min, update min:
		min = arr[i].

step5-Output the Result
	After completing the loop, the variable min contains the smallest element in the array.
	
step6-Display the Result
	Print the value of min.

step7-End
	Terminate the program.
*/




// Here is a step-by-step explanation of the MinElementInArray program:
/*
1. Class Declaration
public class MinElementInArray {
	The program begins with the declaration of a public class named MinElementInArray.
	The class name must match the file name if you save the code in a file.

2. Main Method
public static void main(String[] args) {
	The main method is the entry point of the program. This is where the program execution starts.

3. Array Initialization
int[] arr = { 5, 8, 9, 3, 1, 2, 6 };
	An integer array arr is initialized with the values { 5, 8, 9, 3, 1, 2, 6 }.

4. Initializing the Minimum Variabl
int min = arr[0];
	A variable min is initialized with the first element of the array (arr[0]), which is 5.
	This assumes that the first element is the smallest. The program will then compare it with the other elements.

5. Iterating Through the Array
for (int i = 1; i < arr.length; i++) {
	A for loop is used to iterate through the array starting from the second element (i = 1).
	The loop runs until i reaches the last index of the array (i < arr.length).
	
6. Comparing and Updating Minimum
if (arr[i] < min) {
    min = arr[i];
}
	Inside the loop, the current array element (arr[i]) is compared with the current min value.
	If arr[i] is smaller, the min variable is updated to the new smaller value.
	
7. Printing the Result
System.out.println("Minimum element in the array is: " + min);
	After the loop completes, the program prints the smallest element stored in the min variable.
	
8. Closing the Class
}
The main method and the MinElementInArray class are closed.

*/
	


// Output:
// Minimum element in the array is: 1