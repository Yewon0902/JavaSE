package section12;

import section12.acces2.Cat;
import section12.acces2.HouseCat;
import section12.acces2.PersianCat;

/*
 *  인터페이스(interface)
 *  추상화된 타입을 정의하는데 사용되는 개념
 *  추상메서드와 상수로만 이루어져 있다.
 *  다중 상속이 가능하다.
 *  'implements'  키워드로 상속한다.
 * 
 * 
 */
public class InterfaceClass01 {
   public static void main(String[] args) {
	   PersianCat pCat = new PersianCat();
	   pCat.eat();
	   
	   // pCat.PAW =2; //  인터페이스 상수 변경불가!
	    
	   Cat hCat = new HouseCat();
	   hCat.hunt();
	   
	   
	
}
}
