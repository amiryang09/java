package Studentinheritance;

import Collegeinheritance.College;  //it's a must in inheritance

public class Student extends College{
	
	public void studentName() {
		System.out.println("aaaa......from student");
	}
	public void studentID() {
		System.out.println("1234......from student");
	}
	public void studentdept() {
		System.out.println("ece......from student");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentdept();
		obj.studentID();
		obj.studentName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
	}
}
