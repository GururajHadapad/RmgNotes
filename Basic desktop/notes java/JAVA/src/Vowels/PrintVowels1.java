package Vowels;

import java.util.LinkedHashSet;

public class PrintVowels1 {
public static void main(String[] args) {
	String s="india";
	LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
	
	for(int i=0; i<s.length();i++) {
		hs.add(s.charAt(i));
		
	}int count=0;
	for (Character c : hs) {
	
			if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
			count++;
		}
	}
	
	System.out.println(s+" "+count);
}
}

