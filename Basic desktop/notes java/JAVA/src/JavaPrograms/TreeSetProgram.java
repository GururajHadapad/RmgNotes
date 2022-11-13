package JavaPrograms;

import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		int[] a= {2,7,10};
		TreeSet<Integer> t=new TreeSet<Integer>();
		for(int i=0; i<a.length;i++) {
		t.add(a[i]);
	}
		int x=0; 
		for(Integer i:t) {
			a[x]=i;
			x++;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]!=a[i+1]) {
				for(int j=a[i]+1;j<a[i+1];j++) {
					System.out.print(j+" ");
				}
			}
		}
}
}