package JavaPrograms;

public class SecondMaxNumberWithoutLoop {
public static void main(String[] args) {
	int[] a={4,7,2,8,9,4,3,9};
	int fmax=a[0];
	int smax=a[0];
	for(int i=0 ; i<a.length;i++) {
		if(a[i] > fmax ) {
			smax = fmax;
			fmax=a[i];
		}else if(a[i]> smax && a[i]!=fmax) {
			smax=a[i];
		}
	}
	System.out.println(fmax);
	System.out.println(smax);
}
}

