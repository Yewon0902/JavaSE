package section07;



 // 객체 속성 역할 변수
public class Car {
   int wheel = 4; // 바퀴 4개
   String color = "red";
   String model = "테슬라 Y";
   
   public  void drive() {
	   System.out.println("운전을 해요!");
   }
   
   public void autopilot() {
	   System.out.println("자율주행을 해요!");
 }
}