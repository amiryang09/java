package day6OOPSconcept;

public class inheritancecar extends inheritanceVehicle {  //extends keyword is used 
	
	public void fourwheeler() {
		System.out.println("fourWheeler ----car");
	}

	
	public void brake() { 
		 System.out.println("apply brake car.....CAR");  //OVERRIDING
		 }
	 
	public void aircon() {
		System.out.println("airCon----car");
	}
	
	public static void main(String[] args) {
		inheritancecar obj = new inheritancecar();
		obj.fourwheeler();
		obj.aircon();
		obj.brake();
		obj.soundhorn();
		
	}

}
