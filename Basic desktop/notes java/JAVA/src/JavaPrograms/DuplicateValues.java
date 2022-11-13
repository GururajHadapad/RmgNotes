package JavaPrograms;

import java.util.HashMap;

public class DuplicateValues {
public static void main(String[] args) {
	int[] a= {1,3,6,4,4,4,9,9};
	HashMap hp=new HashMap();
	for(int i=0; i<a.length;i++) {
		if(hp.get(a[i])==null) {
			System.out.println(a[i]);
		}
		hp.put(a[i], true);
	} 
}
}


