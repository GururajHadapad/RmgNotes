package StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SegregateDuplicateCharacters {
public static void main(String[] args) {
	String s="abcdabcdabcdabcd";
	LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
	for(int i=0; i<s.length();i++) {
		hs.add(s.charAt(i));
	}
	for (Character c : hs) {
		int count=0; 
		for(int i=0; i<s.length();i++) {
			if(c.equals(s.charAt(i))) {
				count++;
			System.out.print(c);
			}
		}
		System.out.print(" ");
	} 
}
}
