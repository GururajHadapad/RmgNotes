package BasicPrograms;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value");
	n=obj.nextInt();
	if(n%2==0) {
		System.out.println("number is even");
	}else {
		System.out.println("number is odd");
	}
}
}
