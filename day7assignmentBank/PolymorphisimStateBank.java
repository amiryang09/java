package day7assignmentBank;

public class PolymorphisimStateBank extends PolymorphisimBank {
	
	public void deposit() {
		System.out.println("DEPOSIT....from statebank");   //OVERRIDING
	}
	
	public static void main(String[] args) {
		PolymorphisimStateBank obj = new PolymorphisimStateBank();   //during overriding USE which class's value to be over-rided
		obj.deposit();
		obj.fixed();
		obj.saving();
		
	}
}
