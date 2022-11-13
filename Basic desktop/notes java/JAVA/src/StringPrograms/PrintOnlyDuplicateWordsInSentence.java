package StringPrograms;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWordsInSentence {
public static void main(String[] args) {
	String s="khatam ta ta bye bye";
	String[] str=s.split(" ");
	LinkedHashSet<String> hs=new LinkedHashSet<String>();
	for(int i=0; i<str.length; i++) {
		hs.add(str[i]);
	}
	for (String c : hs) {
		int count=0; 
		for(int i=0; i<str.length; i++) {
			if(c.equals(str[i])) {
				count++;
				
			}
		}
		if(count>1) {
			System.out.println("duplicate word is "+c);
		}
	}
}
}
