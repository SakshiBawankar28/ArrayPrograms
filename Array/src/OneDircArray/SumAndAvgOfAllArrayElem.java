package OneDircArray;

import java.util.Scanner;

public class SumAndAvgOfAllArrayElem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int []arr = new int[size];
		
		int i,j;
		System.out.println("Enter the element of an array : ");
		for(i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Element of an array : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
		int sum = 0;
		for(i=0; i<size; i++)
		{
			sum += arr[i];
		}
		System.out.println("\n\nSum of all element is : " + sum);
		System.out.println("Average of all element is : " + (double)sum/arr.length);
	}

}
