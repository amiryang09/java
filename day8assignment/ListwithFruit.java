package day8assignment;

import java.util.ArrayList;
import java.util.List; 

public class ListwithFruit {

	public static void main(String[] args) {       //DO IT WITH FOR EACH LOOP
		// TODO Auto-generated method stub
		List<String> obj = new ArrayList<>();
		obj.add("apple");
		obj.add("Mango");
		obj.add("orange");
		obj.add("pear");
		for(String eachvalue : obj) {
			System.out.println(eachvalue);
		}
	}

}
