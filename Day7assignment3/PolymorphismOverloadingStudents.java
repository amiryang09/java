package Day7assignment3;

public class PolymorphismOverloadingStudents {
	
	public void studentsinfo(int a) {
		System.out.println(a);
	}
	
	public void studentsinfo(char a, char b ) {
	    System.out.println(a);
	    System.out.println(b);
	}
	
	public void studentsinfo(char a, char b, char f) {
		System.out.println(a);
	    System.out.println(b);
	    System.out.println(f);

	}
	public static void main(String[] args) {
		PolymorphismOverloadingStudents ibj = new PolymorphismOverloadingStudents();
		ibj.studentsinfo(2);
		ibj.studentsinfo('d', 'g');
		ibj.studentsinfo('h', 'y', 't');
		
	}
}