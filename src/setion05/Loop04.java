package setion05;
/*
 * 중접 for문
 * for문 안에 for문
 * 
 * 
 * 
 * 
 * i = 0
 * j = 0
 * **
 * i = 2
 * 
 * 
 * 
 */


public class Loop04 {
   public static void main(String[] args) {
	   /*
	    * i = 0
	    *     j = 0 ~ 6
	    *     ******
	    *     i = 1
	    *     j = 0 ~ 6
	    *     ******
	    *     
	    */
	   
	   for(int i = 0; i < 7; i++) {
		   for(int j = 0; j < 7; j++) {
			   System.out.print("*");
		   }
		   
		   
		   
		   
		   System.out.println();
		   
	   }
	
  }
}
