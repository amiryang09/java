package day6OOPSconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day8Collections {
  //LIST
	
	public static void main(String[] args) {
		
		//ArrayList obj = new ArrayList();  // creating obj  for arraylist
		// [] for arrays only
		// <> angular brackets
		//{} a code block
		
		//List<Generic> obj = new ArrayList<>(); //syntax for list
		//generic--- datatypes(int string etc)
		
		List<String> obj =  new ArrayList<>();
		obj.add("u");
		obj.add("t");
		obj.add("g");
		obj.add("f"); //maintains order
		obj.add("s"); // allows dupe value
		obj.add(1, "b"); // doesn't remove but inserts the value
		obj.set(0, "a"); //replace value 
		obj.remove("a"); //removing the particular value by mentioning the value
		String string = obj.get(0); // particular value by index
		int size = obj.size();
		
		  System.out.println(size ); 
		  System.out.println(obj); //stored in array
		  System.out.println(string);
		  
		for(int i =0; i<obj.size(); i++ ) {  //printing the values out of array and printing line by line
			String string2 = obj.get(i);          //bidirectional(loop)
			System.out.println(string2);  
		}
		for(String eachvalue: obj) {        //same as for loop but doesn't iterate....unidirectional
			System.out.println(eachvalue);
		}
		obj.clear();  //shows empty array
		obj.isEmpty();
		boolean b = obj.contains("amir");
		System.out.println(b);
		
		Collections.sort(obj);     //prints in ascending order
		System.out.println();
	}
	
}
