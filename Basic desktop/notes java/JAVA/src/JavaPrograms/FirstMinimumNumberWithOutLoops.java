package JavaPrograms;

public class FirstMinimumNumberWithOutLoops {
	public static void main(String[] args) {
		int[] a= {2,5,8,1,4	};//1
		int fmin=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<fmin) {
				fmin=a[i];
			}
		}
         System.out.println(fmin);
	}
}