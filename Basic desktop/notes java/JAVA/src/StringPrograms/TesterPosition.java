package StringPrograms;

import java.util.LinkedHashSet;

public class TesterPosition {
public static void main(String[] args) {
	String s="Tester";
	s=s.toLowerCase();
	LinkedHashSet<Character >hs =new LinkedHashSet<Character>();
	for(int i=0; i<s.length();i++) {
		hs.add(s.charAt(i));
	}
	for (Character c : hs) {
		int count=0;
		for(int i=0; i<s.length();i++) {
			if(c.equals(s.charAt(i))) {
				System.out.println(c+" "+(i+1));
				break;
			}
		}
	}
}
}
