package BasicPrograms;

import java.util.Scanner;

public class SumOfOddOrEven {
public static void main(String[] args) {
	int n; 
	int sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("sum of odd or even");
	n=obj.nextInt();
	if(n%2==0) {
		for(int i=0; i<=n; i=i+2) {//2+4+6+8+10=30  ie:n=10
			sum=sum+i;
		}
		System.out.println("sum of even number"+sum);
	}else{
		for(int i=1; i<=n; i=i+2) {//1+3+5+7+9=25  ie:n=10
			sum=sum+i;
		}
		System.out.println("sum of odd num "+sum);
	}
	
}
}
