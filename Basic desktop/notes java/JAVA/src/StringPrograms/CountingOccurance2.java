package StringPrograms;

import java.util.HashSet;

public class CountingOccurance2 {
public static void main(String[] args) {
	String s="occurance";
	HashSet<Character> hs=new HashSet<Character>();
	for(int i=0; i<s.length();i++) {
	hs.add(s.charAt(i));
	}
	for (Character c : hs) {
		int count=0;
	for(int i=0; i<s.length();i++) {
		if(c.equals(s.charAt(i))) {
			count++;
		}
	}
	System.out.println(c+" occurance is "+count);
}
	
}
}
