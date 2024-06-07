package assignment;

public class Comparisionoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 12;
		int c = 13;
		int d = 14;
		if(a == b) {
			System.out.println("a:" + a);   //will not be printed coz it's false
		}
		if(b != c) {
			System.out.println("b:"+ b);
		}
		if(a == b && c != d) {
			System.out.println("c:"+ c);    // will not be printed coz it's false
		}
		if (c == d || a != b) {
			System.out.println("d:"+ d);
		}
		if (a >= b) {
			System.out.println("a:"+ a);     // will not be printed coz it's false   
		}
		if (b <= c) {
			System.out.println("b:"+ b);
		}
	}

}
