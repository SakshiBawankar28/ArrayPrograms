package OneDircArray;

import java.util.Scanner;

public class OccurenceElem {

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
		
		System.out.println("\n\nEnter the element to find it's occurence : ");
		int found = sc.nextInt();
		int occu =0;
		for(i=0; i<size; i++)
		{
			if(arr[i] == found)
			{
				occu++;
			}
		}
		System.out.println("The element's occurence is : " + occu);
	}

}
