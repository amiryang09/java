package assignment;

public class Simpleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simpleclass obj = new Simpleclass();
		obj.carColour();
		obj.carName();
		int carNumber = obj.carNumber();
		System.out.println(carNumber);
	}
      public void carName() {
    	  System.out.println("Benz");
      }
      String carColour() {
    	  String colour  = "pink";
    	  System.out.println(colour);
    	  return colour;
      }
      private int carNumber() {
    	  int number = 1234;
    	  return number;
      }
}
