package BasicPrograms;

public class PrimeNumber {
public static void main(String[] args) {
	int a=40;
	
	for(int i=1;i<=a;i++) {
		int count=0;
		for(int j=i+1;j>=1;j--) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(i+" ");
		}
	}
	
}
}
