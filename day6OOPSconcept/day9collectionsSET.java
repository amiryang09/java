package day6OOPSconcept;

import java.util.ArrayList;
import java.util.List;           // ctrl+shft+o
import java.util.Set;
import java.util.TreeSet;

public class day9collectionsSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//////////SET           //cannot take single value
		Set<String> obj = new TreeSet<>();   
		obj.add("a");
		obj.add("v");
		obj.add("g");
		obj.add("b");
		System.out.println(obj);
		
		for (String eachvalue : obj) {
			System.out.println(eachvalue);
		}
		//converting set into list to get single value 
		
		List<String> obj1 = new ArrayList<>(obj);  
		obj1.get(0);
		System.out.println(obj1.get(0));   
	}

}
