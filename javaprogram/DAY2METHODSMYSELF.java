package javaprogram;

public class DAY2METHODSMYSELF {
	public static void main(String[] args) {
		DAY2METHODSMYSELF obj = new DAY2METHODSMYSELF();
		obj.phoneName();
		int phoneNumber = obj.phoneNumber();
		System.out.println(phoneNumber);
        obj.phoneColour();
	}
	
     public void phoneName() {
    	 System.out.println("Samsung");
     }
     private int phoneNumber() {
    	 int number = 1313121894;
    	 return number;
     }
     String phoneColour() {
    	String Colour = "Purple";
    	System.out.println(Colour);
    	return Colour;
     }
}
