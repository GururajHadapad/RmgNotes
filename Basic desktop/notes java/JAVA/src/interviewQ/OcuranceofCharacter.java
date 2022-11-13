package interviewQ;

import java.util.Scanner;

public class OcuranceofCharacter {
	public static void main(String[] args) {
		
		String s="occurancee";

		for(int i=0; i<s.length(); i++) {
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && i>j) {
					break;
				}else if(s.charAt(i)==s.charAt(j)) {
                     count++;
				}
			}
			if(count>1)
			System.out.println(s.charAt(i)+""+count);
		}
	}

}
