package day9assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTreesetStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   //TREESET   (Alphabetical order)
		Set<String> obj = new TreeSet<>();
		obj.add("Amir");
		obj.add("Sharon");
		obj.add("Bala");
		obj.add("Kiran");
		obj.add("Akash");
		obj.add("Rahul");
		
		for(String eachvalue : obj) {
			System.out.println(eachvalue);
		}
	
		System.out.println("---------------------");
		
   //LINKEDHASHSET (insertion order) 
		Set<String> obj1 = new LinkedHashSet<>();
		obj1.add("Amirtha");
		obj1.add("Sharon");
		obj1.add("Bala");
		obj1.add("Kiran");
		obj1.add("Akash");
		obj1.add("Rahul");
		obj1.add("Amirtha");  //dupe value (will not be added since it doesn't take dupe values)
		int j = obj1.size();
		System.out.println(j);
		boolean b = obj1.contains("Sharon");
		System.out.println(b);
		for(int i = 0; i < 1; i++) {
			System.out.println(obj1);
		}
		
		System.out.println("------------------");
		//
		List<String> obj2 = new ArrayList<>(obj1);
		System.out.println(obj1);
	}

}
