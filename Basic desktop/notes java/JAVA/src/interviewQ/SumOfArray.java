package interviewQ;

public class SumOfArray {

	public static void main(String[] args) {
		int a=1211;
		int b=a;
		int rev=0;
		while(a!=0) {
			int c=a%10;
			rev=rev*10+c;
			a=a/10;
		}
		if(rev==b) {
			System.out.println("pal");
		}else {
			System.out.println("not");
		}
	}
}
