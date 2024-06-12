package day8assignment;

public class AbsScopeRestrictionBOBbank implements AbsScopeRestrictionStatebank{

	@Override
	public void opensavingsacc() {
		// TODO Auto-generated method stub
		System.out.println("Savings account");
	}

	@Override
	public void Amountdeposit() {
		// TODO Auto-generated method stub
		System.out.println("Amount deposited");
	}

	@Override
	public void debitcardnumber() {
		// TODO Auto-generated method stub
		System.out.println("12334567890");
	}
	
	public void PersonalSavings() {
		System.out.println("total amount 123456"); //won't be printed coz this is scope restriction
	}
	
	public static void main(String[] args) {
		AbsScopeRestrictionStatebank obj = new AbsScopeRestrictionBOBbank(); //if AbsScopeRestrictionBOBbank is written before obj then the java class will be accessible
		obj.Amountdeposit();
		obj.debitcardnumber();
		obj.opensavingsacc();
	}
}
