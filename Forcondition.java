package assignment;

public class Forcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {          
			System.out.println(i);
		}
		for(int i = 1; i < 10; i++) {      //how many times (no. of loop)
			for(int j = 2; j < 5; j++) {   // what to print 
				System.out.println(j);
			}
		}
	}

}
/*  single for loop
 *  1) i = 0
 *  2) check if i = 0 < 10....yes
 *  3) print 0
 *  4) i++ => 0++ =>i = 1
 *  5) i = 1
 */

 /* for loop has an another inner for loop
  * 1) i = 1
  * 2) check if i = 1 < 10....yes
  * 3) j = 2 
  * 4) check if j =2 < 5....yes
  * 5) print 2
  * 6) j++ => 2++ => j =3
  * 7) check if j = 3 < 5....yes
  * 8) print 3
  * 9) j++ => 3++ => j =4
  * 10 check if j = 4 < 5....yes
  * 11) print 4
  * 12) j++ => 4++ => j =5
  * 13) check if j = 5 < 5....no and return to loop 1 
  * 14) i++ => 1++ =>i = 2
  * */
