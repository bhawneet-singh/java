import java.util.*;
//array are large bank of memory 
//array are used to stored large no. of data used small and handy syntex.

public class Arrays
{
	public static void main(String [] Args)
	{
		// creating an array in java
		int [] numbers = new int[5];
		//return numbers array of length 5.
		//index of array always start form 0.
		numbers[0] = 11;
		numbers[1] = 12;
		numbers[2] = 13;
		numbers[3] = 14;
		numbers[4] = 15;
		System.out.println(numbers);
		//print the hadcode(code ref. to first operand of array).
		//to print the Array we can javas Array class.
		// or we cam use for loop

		for(int item : numbers)
			System.out.println(item);
	}
}