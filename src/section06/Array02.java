package section06;

public class Array02 {
    public static void main(String[] args) {
    	
           
	  //문자열 배열객체 생성하기
    	String[] names = new String[6];
    	
      // 배열에 값 대여하기
    	names[0]= "짱구";
    	names[1]= "짱아";
    	names[2]= "신형만";
    	names[3]= "봉미선";
    	names[4]= "맹구";
    	names[5]= "철수";
    	
    	//값 가져오기
    	System.out.println(names[3]);
    	
    	// 배열의 길이
    	System.out.println(names.length);
    	
    	// 배열 for문을 사용하여 전체 출력하기
    	for(int i = 0; i < names. length; i++) {
    		System.out.println(names[i]);
    	}
    	
    	
 }
}
