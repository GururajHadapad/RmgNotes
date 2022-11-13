package JavaPrograms;

public class FirstMaximumNumberWithoutLoop {
public static void main(String[] args) {
	int[] a= {2,5,4,1,7};//7
	int fmax=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>fmax) {
			fmax=a[i];
			
		}
	}
	System.out.println(fmax);
}
}