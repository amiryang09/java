package assignment;

public class Unaryandshorthand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		a=a+7;           //shorthand
		b=b-2;           //shorthand
		c*=c;           //shorthand
		d/=b;            //shorthand
		System.out.println("a:"+ a);
		System.out.println("b:"+ b);
		System.out.println("c:"+ c);
		System.out.println("d:"+ d);
		System.out.println("e:"+ a++);  //unary
		System.out.println("f:"+ ++b);  //unary
		System.out.println("g:"+ c--);  //unary
		System.out.println("h:"+ --d);   //unary
		System.out.println("i:"+ -a);    //unary
		System.out.println("j:"+ +b);   //unary
	}

}
