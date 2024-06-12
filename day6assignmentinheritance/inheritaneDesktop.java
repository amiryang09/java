package day6assignmentinheritance;

public class inheritaneDesktop extends inheritanceLaptop{

	public void desktopSize() {
		System.out.println("15.6''.....from desktop");
	}
	
	public static void main(String[] args) {
		inheritanceLaptop obj = new inheritanceLaptop();
		inheritaneDesktop obj1 = new inheritaneDesktop();
		obj.laptopModel();
		obj1.desktopSize();
	}
}
