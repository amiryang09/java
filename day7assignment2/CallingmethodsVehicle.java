package day7assignment2;

public class CallingmethodsVehicle  extends CallingmethodCar{
	public void applyBrake() {
		System.out.println("Brake....from vehicle");
	}
	
	public void soundHorn() {
		System.out.println("Horn....from vehicle");
	}
	
	public static void main(String[] args) {
		CallingmethodsVehicle obj =  new CallingmethodsVehicle();
		obj.applyBrake();
		obj.meter();
		obj.mirror();
		obj.soundHorn();
	}
}
