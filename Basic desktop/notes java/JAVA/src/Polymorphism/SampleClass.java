package Polymorphism;

public class SampleClass {

	int a=10;
	static int b=20;
	
	public void test() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void test_1() {
		SampleClass s=new SampleClass();
		System.out.println(s.a);
	}

	public static void main(String[] args) {
     
		SampleClass s=new SampleClass();
		System.out.println(s.a);
		s.test();
		System.out.println(SampleClass.b);
		SampleClass.test_1();
	
	}
}
