package arrays;

import java.util.Scanner;

public class FindArrayLengthWithUserInput 
{
	// Main method to get the array length and elements
    public static void main(String[] args) 
    {
    	// Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements you want in the array: ");
        int length = scanner.nextInt();

        // Create the array with the specified length
        int[] array = new int[length];

        // Ask the user to fill the array
        System.out.println("Enter " + length + " elements for the array:");
        for (int i = 0; i < length; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            // Get the input from the user
            array[i] = scanner.nextInt();
        }

        // Print the array length
        System.out.println("The length of the array is: " + array.length);

        // Optional: Print the elements of the array
        System.out.print("The elements in the array are: ");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}

/*
OUTPUT:
	Enter the number of elements you want in the array: 6
	Enter 6 elements for the array:
	Element 1: 12
	Element 2: 45
	Element 3: 67
	Element 4: 34
	Element 5: 23
	Element 6: 1
	The length of the array is: 6
	The elements in the array are: 12 45 67 34 23 1 
*/