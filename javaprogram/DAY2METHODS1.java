package javaprogram;

public class DAY2METHODS1 {
   public static void main(String[] args) {          //main method to call the values
	//classname obj = new classname()
	   
	   DAY2METHODS1 obj = new DAY2METHODS1();       //create obj using the public class 
	   obj.printMyname();
	   int vehicleNumber = obj.vehicleNumber();
	   System.out.println(vehicleNumber);
}
	//access modifier returntype methodename(args){} 
	
	public void printMyname() {                 //this is public access modifier
		System.out.println("amirtha");         //multiple values can be stored under this printMyname method
	}                                          // no need of return     
	
	private int vehicleNumber() {              //this is pvt access modifier 
		//System.out.println("8");           //multiple values can be stored under this vehicleNumber method
		int number  = 8;
		return number;                       //return should be mentioned 
	}
	String getVehiclecolour() {             //may or may not use get in methodname 
		String colour = "yellow";          //S must be caps & String must be double quotes 
		return colour;                     // can write using pub void also
	}
	int a=5;                                       //global variable
	int b=6;
	public int addtwoNumbers(int a,int b) {
		return a+b;
	}
	public float subtwoNumber(float a, float b) {
		return a-b;
	}
	
}
