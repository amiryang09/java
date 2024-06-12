package javaprogram;

public class DAY3ACCESSMODIFIER {
	public static void main(String[] args) {
		DAY2METHODSMYSELF obj = new DAY2METHODSMYSELF();
		obj.phoneName();            //can access from different class (call) public    
		                           // private modifier cannot be accessed..only within the program
		obj.phoneColour();         // cannot be accessed outside the package 
	}

}
