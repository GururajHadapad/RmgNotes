package BasicPrograms;

import java.util.Scanner;

public class PrintAllOddNumber2 {
public static void main(String[] args) {
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no. of terms to find odd numbers");
	n=obj.nextInt();
	for(int i=1; i<=n; i=i+2) {
			System.out.println(i);
		}
	}
}

