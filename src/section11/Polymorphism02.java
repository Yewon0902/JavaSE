package section11;

import section11.acces.Bus;
import section11.acces.Car;
import section11.acces.SchoolBus;

public class Polymorphism02 {
 public static void main(String[] args) {
	
	 /*
	  * 1. car drive()
	  * 2. bus drive()
	  * 3. schoolbus drive()
	  * 
	  */
	 SchoolBus sb1 = new SchoolBus();
	 sb1.drive();              //3
	 
	 System.out.println(System.identityHashCode(sb1));
	 
	 Car c1 = sb1;            //3
	 c1.drive();
	 
	 System.out.println(System.identityHashCode(c1));
	 
	 Bus b1 = (Bus) c1;       //3
	 b1.drive();              // 상위클래스에서 하위클래스 대입 강제형변환
	 
	 System.out.println(System.identityHashCode(b1));
	 
	 System.out.println("sb1.color: " + sb1.color);
	 System.out.println("sb1.color: " + c1.color);
	 System.out.println("sb1.color: " + b1.color);
	 
	 c1.color = "Red";
	 
	 System.out.println("sb1.color: " + sb1.color);
	 System.out.println("sb1.color: " + c1.color);
	 System.out.println("sb1.color: " + b1.color);
}
}
