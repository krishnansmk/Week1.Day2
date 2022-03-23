package week1.day1;

import java.util.Arrays;

public class Missingnumbers 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
			
		for (int i=arr[0];i<arr.length;i++) 
		{
			if(i!=arr[i-1]) 
			{
				System.out.println("Missing number in the array is: "+ i );
				break;
			}
		}
	}

}
