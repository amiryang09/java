package day6OOPSconcept;

public class Day8abstractionHDFC implements Day8abstractionRBI {

	@Override
	public void openSavingsAccount() {
		// TODO Auto-generated method stub
		System.out.println("123");
	}
	public void personalloan() {
		System.out.println("amount deposited");
	}
	public static void main(String[] args) {
		Day8abstractionRBI obj = new Day8abstractionHDFC(); // scope restriction
		obj.openSavingsAccount();  // calling the methods only from design page only
	}

} //  can call all the methods from both class and interface too
  // line 14 scope restriction(only one method is changed )