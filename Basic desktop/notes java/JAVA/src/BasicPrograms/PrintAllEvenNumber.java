package BasicPrograms;

import java.util.Scanner;

public class PrintAllEvenNumber {
public static void main(String[] args) {
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no. of terms to find even numbers");
	n=obj.nextInt();
	for(int i=0; i<=n; i=i+2) {
		System.out.println(i);
	}
}
}
