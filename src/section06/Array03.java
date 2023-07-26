package section06;

public class Array03 {
  public static void main(String[] args) {
	// new 연산자 사용하지 않고 직접 배열 값 대입하기
	String[] names = {"신형만", "봉미선", "짱구", "짱아", "철수", "훈이"};

	// 배열 내용 전체 출력
	for(int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
	System.out.println("============================");
	
	// 배열 값 수정하기
	names[5] = "맹구";
	
	// 확장 for문
	for(String name : names) {
		System.out.println(name);
	}
}
}
