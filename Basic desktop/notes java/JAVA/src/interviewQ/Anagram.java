package interviewQ;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Race";
		String s2="Care";
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		if(str1.length()==str2.length()) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 =str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result = Arrays.equals(ch1, ch2);
		if(result) {
			System.out.println("anagram");
		}
		}
		else {
		System.out.println("not anagram");
		}
	
}}
