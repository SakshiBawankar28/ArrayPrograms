package OneDircArray;

import java.util.Scanner;

public class HighestMaxMinElem {

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
		
		System.out.println("\n\nSorted element of an array : ");
		for(i=0; i<size; i++)
		{
			for(j=0; j<size-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n\nMinimum element : " + arr[0]);
		System.out.println("\nMaximum element : " + arr[size-1]);
	}

}
