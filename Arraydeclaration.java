package assignment;

import java.util.Arrays;

public class Arraydeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,7,8,9};
		int l;
		l = num.length;
		System.out.println(l);
		System.out.println("----------------");
		for(int i=1; i<l;i++) {
			System.out.println(num[i]);
		}
		Arrays.sort(num);
		for(int i=1; i<l;i++) {
			System.out.println(num[i]);
		}
	}

}
