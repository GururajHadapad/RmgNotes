package interviewQ;

public class UpperNLowerCase {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,1};
		int[] b= {5,4,3,2,1};
		int count=a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for(int i=0;i<count;i++) {
			try {
				System.out.println(a[i]+b[i]);
			}catch(Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}else {
					System.out.println(b[i]);
				}
			}
		}
	}
}
