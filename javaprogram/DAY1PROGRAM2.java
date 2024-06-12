package javaprogram;

public class DAY1PROGRAM2 {
	public static void main(String[] args) {
		int a = 13;
		int b = 6;
		int c = 13;
		int d = 20;
		int add = (a + b);
		int sub = (a - b);
		int mul = (a * b);
		int div = (a / b);
		System.out.println("add:"+ add);
		System.out.println("sub:"+ sub);
		System.out.println("mul:"+ mul);
		System.out.println("div:"+ div);
		if(a == c) {
			System.out.println("a:" + a);
		}
		if(a != b) {
			System.out.println("b:"+ b);
		}
		if(a == c && d != a) {
			System.out.println("d:"+ d);
		}
		if (a == c || d != a) {
			System.out.println("b;"+ b);
		}
	}

}
