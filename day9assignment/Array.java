package day9assignment;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		int len = arr.length;                 //length
		
		Arrays.sort(arr);                                      //ascending order
		System.out.println("----------------------------");
		for(int i = 1; i<len; i++) {
			  if(i != arr[i-1])            
		{
			             // checking in sorted array one by one
			System.out.println(i);
			break;
		}	
	}
	}

}
