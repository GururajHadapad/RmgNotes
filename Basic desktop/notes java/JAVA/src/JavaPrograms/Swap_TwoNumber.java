package JavaPrograms;

public class Swap_TwoNumber {
	public static void main(String[] args) {
		
		int a=2;
		int b=4;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
//			int c;
//		c=a; //10
//		a=b; //20
//		b=c; // 10
		
		a=a+b;//2+4=6
		b=a-b;//6-4=2
		a=a-b;//6-2=4
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

