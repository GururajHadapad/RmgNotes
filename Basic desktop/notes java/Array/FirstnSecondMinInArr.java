package Array;

public class FirstnSecondMinInArr {

	public static void main(String[] args) {
		int[] a= {10,40,50,20,30};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]);
		System.out.println(a[1]);

	}

}
