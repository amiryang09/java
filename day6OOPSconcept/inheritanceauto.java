package day6OOPSconcept;

public class inheritanceauto extends inheritanceVehicle {
	public void twowheeler() 
	{
		System.out.println("twowheeler----auto");
	}
	public void meter() {
		System.out.println("meter-----auto");
	}
	public static void main(String[] args) {
		inheritanceauto obj = new inheritanceauto();
			obj.twowheeler();
			obj.meter();
			obj.brake();
			obj.soundhorn();		 
	}
}
 