package day8assignment;

public class AbstractionAutomationLang implements AbstractionLanguage {

	@Override
	public void Python() {
		// TODO Auto-generated method stub
		System.out.println("Python");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}
	
	
	  public static void main(String[] args) { 
		  AbstractionAutomationLang obj = new AbstractionAutomationLang(); 
		  obj.Python(); 
		  obj.Selenium();
		  }
	 

}
