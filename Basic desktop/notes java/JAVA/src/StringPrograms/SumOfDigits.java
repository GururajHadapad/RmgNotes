package StringPrograms;

public class SumOfDigits {
public static void main(String[] args) {
	int n=56;
	int rem;
	int sum=0;
	while(n!=0) {
		rem=n%10;
		sum=sum+rem;
		n=n/10; 
	}
	System.out.println(sum);
}
}
