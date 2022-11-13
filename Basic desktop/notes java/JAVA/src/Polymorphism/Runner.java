package Polymorphism;

public class Runner {
	public static void main(String[] args) {
		Test_C obj=new Test_C();
		Test_B obj1=obj;
		obj1.run();
		obj1.test();
		
		Test_A obj2=obj1;
		obj2.test();
		
		Test_C obj3=(Test_C)obj1;
		obj3.demo();
		obj3.disp();
		obj3.test();
		obj3.run();
 		
		
	}
	
}
 