package OneDircArray;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the element of an array : ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Element of an array : ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println("\nReverse array : ");
		for(int i=size-1; i>=0; i--)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\nReverse array : ");
		
		for(int i=0; i<size/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
		}
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		

	}

}
