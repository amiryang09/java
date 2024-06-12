package day3;

import javaprogram.DAY2METHODSMYSELF;          //when we access from diff package import shows
      
public class Modifiers {
	public static void main(String[] args) {
		DAY2METHODSMYSELF obj = new DAY2METHODSMYSELF();   //ctrl+shft+o (for import )
		                                  //string can only be used within the package
		obj.phoneName();

	}

}
