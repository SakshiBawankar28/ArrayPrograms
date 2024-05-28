package OneDircArray;

import java.util.Scanner;

public class EvenOddHowManyElem {

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
		
		int count=0;
		for(i=0; i<size; i++)
		{
			if(arr[i]%2 == 0)
			{
				count++;
			}
		}
		System.out.println("\n\nTotal even numbers in array : " + count);
		System.out.println("Total odd numbers in array : " + (arr.length-count));
	}

}
