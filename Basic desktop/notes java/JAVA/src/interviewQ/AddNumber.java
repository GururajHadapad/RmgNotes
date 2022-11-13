package interviewQ;

public class AddNumber {
public static void main(String[] args) {
	int a=123456;
	int rev=0;
	while(a!=0) {
		int b=a%10;
		rev=rev+b;
		a=a/10;
	}
	System.out.println(rev);
}
}
