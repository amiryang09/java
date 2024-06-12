package javaprogram;

public class DAY5STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "amirtha";                //string literal  CHM CPM DECLARING (STORE ONLY LITERALS)
		String text1 = new String("fmirtha");  //string in obj   CHM  (TO STORE IN MEMORY )
		boolean equals2 = text.equals(text1);
		System.out.println("equals2:" + equals2);     // == => .equals  // didnt store so 
		
		String u = text1.toUpperCase();
		System.out.println("upperCase:" + u);          //stored in a variable
		
		String l = text1.toLowerCase();
		System.out.println("lowerCase:" + l);          // it will be stored as upper...now changed to lower
		
		//Stringcomparision
		
		boolean equals = text.equals(text1);     //ctrl+2+l to save in local variable
		System.out.println("equals:" + equals);
		
		//incase Sensitivity
		boolean equalsIgnoreCase = u.equalsIgnoreCase(l);  //comparing upper and lower(text1 is used for both)
		System.out.println("equalsIgnoreCase:"+ equalsIgnoreCase);//check if values are same ignore cases 
		
		//equals
		System.out.println(u.equals(l));  //checking if equal or not 
		
		//checking if particular value is there or not
		String d1 = "i'm in chennai";
		String t2 = "chennai";
		boolean contains = d1.contains(t2);
		System.out.println("contains:"+contains);
		
		//checking using starting letter
		boolean startsWith = t2.startsWith("ch");  // checking in t2
		System.out.println("startsWith:"+startsWith);
		
		//checking using ending letter
		boolean endsWith = d1.endsWith("ai");
		System.out.println("endsWith"+endsWith);
		
		//concat (adding 2 strings) method 1
		String concat = text1.concat(" asdffg");
		System.out.println("concat:"+ concat);
		
		//concat operation  method 2 ("+" operator is used )
		String text2 = text + "asdaf"; 
		System.out.println("text2:"+text2);
		
		//converting string to array 
		for(int i = 0; i < text.length(); ++i) {
			char charAt = text.charAt(i);  //doesn't get stored but print in console
			System.out.println("charAt:"+charAt);
		}
		//converting string to array
			char[] charArray = text.toCharArray();
			for(int i = 0; i < charArray.length; i++)
			{
			  System.out.println(charArray[i]);  //stores in local variable and prints in console
			}
			
		//finding whole word  
			String text4 = "this is amirtha in chennai"; 
			String text5 = new String("amirtha");
			String[] split = text4.split("i");
			for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
			
			//removing beginning index...prints after index
			String substring = text5.substring(2);
			System.out.println(substring);
			
			//removing before beginning index and after end index...prints after index 
			String substring2 = text5.substring(2, 5);  //end index = 4+1 = 5 = t
		    System.out.println(substring2);
			
			//replace character
			String replace = text5.replace("ami", "dih");
			System.out.println(replace);
			
			//replacing number with string
			String text6 = "asdsf 234";
			String replaceAll = text6.replaceAll("[0-9]", "");
			System.out.println(replaceAll);
			
			//replacing strings with numbers
			String replaceAll1 = text6.replaceAll("[^0-9]", "");
			System.out.println(replaceAll1);
			
			
			int count  = 0;
			String[] split1 = d1.split("e"); //finding "a" in string text
			for(int i = 0; i < split1.length-1; i++ ) {
				count++; 
			}
			System.out.println("occurence "+count);
	}
}

