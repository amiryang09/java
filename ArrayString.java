package assignment;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		int l = str.length();
		System.out.println(l);    //length
		
		
		  char[] charArray = str.toCharArray();  //converting and printing string
	       for(int i = 0; i < charArray.length; i++)
		  {
			System.out.println(charArray[i]);
		  }
		
		
		String[] split = str.split("e"); //finding "e in string str "
		for(int i = 0; i < split.length-1; i++ ) {
			count++;  
		}
		System.out.println("occurence "+ count);
	}

}
