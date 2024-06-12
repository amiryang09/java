package day10assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComaprisionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {3,2,5,6,8};
		int [] arr2 = {4,2,1,6,11};
		System.out.println("arr1" + arr1.length);
		System.out.println("arr2" + arr2.length);
		
		System.out.println("Printing array 1");
		Arrays.sort(arr1);
		for(int i = 0 ; i < arr1.length; i++) {        //printing array1 
			System.out.println(arr1[i]);
		}
		
		System.out.println("Printing array 2");
		Arrays.sort(arr2);
		for(int j = 0 ; j < arr2.length; j++) {        //printing array2 
			System.out.println(arr2[j]);
		}
		
		
		System.out.println("Comparing two arrays");
		
		boolean b = Arrays.equals(arr1, arr2);
		
		if(b ) 
		{
			System.out.println("The arrays are equal");
		}
		else 
		{
			System.out.println("The arrays are not equal");
		}
		
		// print the first array(should match item in both array)
		int i = 0 ,j = 0;
		System.out.println("Intersection of two arrays");
		for(i = 0; i < arr1.length; i++) {
			for(j = 0 ; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) 
				{
					System.out.println(arr2 [j]);
				}
			}
		}
	}
	
}
