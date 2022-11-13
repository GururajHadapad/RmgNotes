package StringPrograms;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class PrintPositionOfAllTheCharacter {
public static void main(String[] args) {
	String s="occurance";
    LinkedList<Character> hs=new LinkedList<Character>();
	for(int i=0; i<s.length();i++) {
		hs.add(s.charAt(i));
	}
	for (Character c : hs) {
		int count=0;
		for(int i=0; i<s.length();i++) {
			if(c.equals(s.charAt(i))) {
				
			}
		}
		System.out.println(c+" postion of unique character is "+s.indexOf(c));
	}
}
}

