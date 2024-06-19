package OneDircArray;

public class MergeTwoArray {

	public static void main(String[] args) 
	{
		int []arr1 = {1,2,3};
		int []arr2 = {6,7,8};
		int []mergeArr = new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++)
		{
			mergeArr[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			mergeArr[arr1.length + i] = arr2[i];
		}
		
		for(int i : mergeArr)
		{
			System.out.print(i+" ");
		}

	}

}
