package BasicPrograms;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
public static void main(String[] args) {
	int n;
	int sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no. of terms");
	n=obj.nextInt();
	for(int i=1; i<=n; i++) {

	sum=sum+i;
	}
	System.out.println("sum of first natural num ="+sum);
}
}
