package Practice;

import java.util.LinkedHashSet;

public class StringExe{
	public static void main(String [] args) {
		String s="vinay naidu";
		String[] str=s.split(" ");
		String rev="";
		for(String c:str) {
			rev=c.substring(0, 1);
		String upper = rev.toUpperCase();
		
		System.out.print(upper);
}
}
}