package interviewQ;

import java.util.HashMap;

public class RemoveDuplicates {
public static void main(String[] args) {
	 int a[] = {2,1,1,1,1,2,3,4,5,5};
	 HashMap hp=new HashMap();
	 for(int i=0; i<a.length;i++) {
		if(hp.get(a[i])==null) {
			System.out.println(a[i]);
		}
		hp.put(a[i], true);
	 }
}
}
