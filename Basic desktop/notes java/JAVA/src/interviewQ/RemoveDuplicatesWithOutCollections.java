package interviewQ;

public class RemoveDuplicatesWithOutCollections {

	public static void main(String[] args) {
		int[]a= {1,1,1,2,2,3,3,4,4,5,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			try{
				if(a[i]!=a[i+1]) {
					System.out.println(a[i]);
				}
			}catch(Exception e) {
				System.out.println(a[i]);
			}
		}
	}
}
