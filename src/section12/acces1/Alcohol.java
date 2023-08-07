package section12.acces1;

public abstract class Alcohol {
   // 속성
	public String name;
	public int proof;
	public int price;
	
	protected String taste;
	
	// 구현되지 않은 추상메서드
	 public abstract void setTaste(String taste);
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("Proof: " + proof);
		System.out.println("Price: " + price);
		System.out.println("Taste: " + taste);
	}
	
}
