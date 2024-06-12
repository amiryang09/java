package day6OOPSconcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day10CollectionsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Map<String, Integer> obj = new LinkedHashMap<>();
		  
		  obj.put("balaji", 7);
		  obj.put("a", 9); 
		  obj.put("c", 1); 
		  obj.put("d", 13);
		  obj.put("f", 6); 
		  obj.put("t", 4); 
		  obj.put("t", 8); // doesn't print the duplicate key value..only prints the latest value obj.put("j", 6); //prints if the values are duplicated
		  
		  System.out.println(obj);
		  
		  Integer integer = obj.get("a"); 
		  System.out.println(integer);
		 
		  System.out.println("--------------");
		  
		  
		Map<Integer, String> obj1 = new HashMap<>();
		obj1.put(1, "b");
		obj1.put(2, "g");
		obj1.put(5, "n");
		obj1.put(7, "d");
		obj1.put(3, "j");
		obj1.put(9, "h");
		System.out.println(obj1);
		String string = obj1.get(2);              // getting single value
		System.out.println(string);
		
		Set<Integer> keySet = obj1.keySet();     //printing all the values with the key
		for(Integer eachkey : keySet) 
		{
			System.out.println(eachkey + "-" + obj1.get(eachkey));  
		}
		Set<Entry<Integer, String>> entrySet = obj1.entrySet();        //printing all the values with it's respective key
		for(Entry<Integer, String>eachentry : entrySet)
		{
			System.out.println(eachentry.getKey() + "-" + eachentry.getValue());
		}
		}

}
