package assignment;

public class StringToArrayconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Feeling good";
		
		char[] charArray = s.toCharArray();
		for(int i = 0; i < charArray.length;i++)
		{
			System.out.println(charArray[i]);
		}
		
		System.out.println("--------------");
		int l = s.length();
		System.out.println(l);
		
	}

}
