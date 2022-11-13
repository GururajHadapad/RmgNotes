package interviewQ;

import java.util.LinkedHashSet;

public class occurance {

	public static void main(String[] args) {
		String s="Vinay Naidu";
		String[] str=s.split(" ");
		for(String c:str) {
			String name=c.substring(0,1 );
			System.out.print(name+" ");
		}
		
	}
}
