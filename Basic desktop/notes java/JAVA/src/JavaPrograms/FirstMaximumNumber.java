package JavaPrograms;

public class FirstMaximumNumber {
	public static void main(String[] args) {
		int[] a= {2,7,5,4,8};//2,4,5,7,8
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]);
	}
}
