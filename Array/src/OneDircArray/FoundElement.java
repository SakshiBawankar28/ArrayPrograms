package OneDircArray;

import java.util.Scanner;

public class FoundElement {

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
		
		System.out.println("\n\nEnter the element to find : ");
		int found = sc.nextInt();
		boolean flag = false;
		for(i=0; i<size; i++)
		{
			if(arr[i] == found)
			{
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");
	}

}
