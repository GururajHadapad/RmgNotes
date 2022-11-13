package interviewQ;

public class MissigNumWithCollections {
public static void main(String[] args) {
	int[] a= {1,5,9};
	int num=a[0]-0;
	for(int i=0;i<a.length;i++) {
		if(a[i]-1!=num) {
			while(num<a[i]-i) {
				System.out.print((i+num)+" ");
				num++;
			}
		}
	}
}
}