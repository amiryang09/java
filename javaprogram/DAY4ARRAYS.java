package javaprogram;

import java.util.Arrays;

public class DAY4ARRAYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[]ages = {1,2,3,4,5};           //printing single value
		System.out.println(ages[1]); //i=1 =>2
		System.out.println("----------------------------");
		int length = ages.length;    // calculation of length       
        System.out.println(length);       //length = no. of items
        System.out.println("----------------------------");
        
for(int i=0;i<length;i++)                                    //printing all the values in a array        
{
	System.out.println(ages[i]);   
}
System.out.println("----------------------------");

int[] ages1 = new int[5];   //adding items into array
ages1[0] = 8;
ages1[1] = 6;
ages1[2] = 7;
ages1[3] = 9;
ages1[4] = 6;
for(int i=0; i<5; i++) {
	System.out.println(ages1[i]);
	
}
	
	Arrays.sort(ages1);                                      //to write in accending order
	System.out.println("----------------------------");
	for(int i=0; i<5; i++) 
	{
		System.out.println(ages1[i]);
	
	}
	}
}

