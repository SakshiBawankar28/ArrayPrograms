package OneDircArray;

import java.util.Scanner;

public class CountMaxElemThanGivenElem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int []arr = new int[size];
		int i, elem;
		int count=0;
		
		System.out.println("Enter the elementes of the array : ");
		for(i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The elementes of the array : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println("\nEnter the element in the array to find out how many element are element are greater that element");
		elem = sc.nextInt();
		for(i=0; i<size; i++)
		{
			if(arr[i] < elem)
			{
				count++;
			}
		}
		System.out.println("Element are element are greater the "+ elem +" are : "+count);
		
	}

}
