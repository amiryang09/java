package day6OOPSconcept;

public class day7ploymorphism {
	//public void  openDoor() {
		//System.out.println("open right door");
//	}public void openDoor() {
		
	//}
	//Method overloading 
	public void add(int a, int b) {  // OVERLOADING 

		System.out.println(a+b);
	}
	public void mul(int a, int b, int c) {
		System.out.println(a*b*c);            //2 parameter and 2 same parameter it will throw error
	}
	public void sub(float a, float b) {
		System.out.println(a-b);
		
	}
	public void div(double a, double b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		 day7ploymorphism obj = new day7ploymorphism();
		 obj.add(2, 6);
		 obj.mul(3, 8, 7);
		 obj.div(40.40, 20.20);
		 obj.sub(62, 3);
	}
   
    
}
