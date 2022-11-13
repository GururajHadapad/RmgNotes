package Vowels;

import java.util.LinkedHashSet;

public class PrintVowels2 {
public static void main(String[] args) {
	String[] s= {"hi","hello","india"};
	//int count=0;
	for(int i=0; i<s.length;i++) {
		String str=s[i];
		
		LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
		
		for(int j=0; j<str.length();j++) {
			hs.add(str.charAt(j));
			
		}int count=0;
		for (Character c : hs) {
		
				if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
				count++;
			}
		}
		
		System.out.println(str+" "+count);
	
	}
}
}
