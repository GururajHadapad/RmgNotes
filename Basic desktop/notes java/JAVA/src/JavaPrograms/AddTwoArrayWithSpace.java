package JavaPrograms;

public class AddTwoArrayWithSpace {
public static void main(String[] args) {
	int[] a= {1,2,3,1};
	int[] b= {9,9,9};
	
	for(int i=0;i<a.length-1;i++) {
		int sum=0;
		int x=0;
		int y=0;
		sum=sum+a[i]+b[i];
		x=sum%10;
		y=sum/10;
		System.out.print(y+" "+x+" ");
	}
}
}
