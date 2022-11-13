package StringPrograms;

public class SumOfDigits2 {
public static void main(String[] args) {
	int n=789;
	int d;
	while(n>9) {
		int sum=0; 
		while(n>0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		n=sum;
	}
	System.out.println(n);
}
}