package assignment;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeedetails obj = new Employeedetails();
		obj.empId();
		obj.printEmployeemobileNumber();
		obj.printEmpsalary();
		obj.getEmployeeaddress();
		obj.printEmployeeName();
	}
	String printEmployeeName() {
   	 String name = "Amirtha";
   	 System.out.println(name);
   	 return name;
    }
	public void empId() {
	   	 int id = 001;
	   	 System.out.println(id);
	}
	String getEmployeeaddress() {
		String address = "dubai main road";
		System.out.println(address);
		return address;
	}
	public void printEmpsalary() {
		double empsalary = 30000.65;
		System.out.println(empsalary);
	} 
	public long printEmployeemobileNumber() {
		long mobnum = 1234567890;
		System.out.println(mobnum);
		return mobnum;
	}	
}