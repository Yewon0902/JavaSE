package section12;
/*
 * 인터페이스 상속
 *  인터페이스끼리 상속관계를 만들수 있다.
 *  클래스 상속과 마찬가지로 extends 키워드 사용한다.
 *  다중 상속이 가능하다. 콤마(,) 사용
 * 
 */
public class interfaceClass02 {

	 public static <TJmic> void main(String[] args) {
		 System.out.println("---TJmic 객체 ---");
		 TJmic tj = new TJmic();
		 tj.connect();
		 tj.music();
		 tj.sing();
		 
		 
	 }
}
