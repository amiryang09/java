package assignment;

public class Bikeclasscallingfromtwowheelerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikeclasscallingfromtwowheelerclass obj = new Bikeclasscallingfromtwowheelerclass();
		boolean applyBrake = obj.applyBrake();
		System.out.println(applyBrake);
		
		boolean applyGear = obj. applyGear();
		System.out.println(applyGear);
		
		boolean switchonAc = obj. switchonAc();
		System.out.println(switchonAc);
		
		boolean applyAccelerate = obj. applyAccelerate();
		System.out.println(applyAccelerate);
		
		Twowheeler obj1 = new Twowheeler();   //if adding another object, it should be named different          
				obj1.noofWheels();           // 1st object = object.......2nd object = obj1
				obj1.noofMirrors();
	}
	public boolean applyBrake() {
		boolean brake = true;
		return brake;
	}
	public boolean applyGear() { 
		boolean gear = false;
		return gear;
	}
	private boolean switchonAc() {
		boolean ac = true;
		return ac;
	}
	private boolean applyAccelerate() {
		boolean accelerate = false;
		return accelerate;
	}
}
