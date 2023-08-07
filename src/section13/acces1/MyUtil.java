package section13.acces1;

public class MyUtil {
	
	public String str1 = "일반멤버 변수";
	public static String str2 = "정적멤버 변수";
	
	public class HelloPrinter {
		public void printHello() {
			System.out.println("인스턴스 내부클래스 HelloPrinter 입니다.");
			
		//System.out.println("");
		}
	}

	public static class Calculater {
		public void calc(int a, int b) {
			System.out.println("전달 받은 후 정수의 합: " + (a + b));
		}
	}
}
