package Practice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String name=sc.next();
		
		for(int i=0;i<name.length();i++) {
			char ch1=name.charAt(i);
			int count=0;
			for(int j=0;j<name.length();j++) {
				char ch2=name.charAt(j);
				if(ch1==ch2 && i>j) {
						break;
					}if(ch1==ch2) {
						count++;
					}
				}
			
			if(count>0) {
				System.out.println(ch1+""+count);
			}
			
		}
		
	}
}
