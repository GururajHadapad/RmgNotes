package BasicPrograms;

import java.util.Scanner;

public class PrintAllOddNumber {
public static void main(String[] args) {
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no. of terms to find odd numbers");
	n=obj.nextInt();
	for(int i=1; i<=n; i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
}
}
