package BasicPrograms;

import java.util.Scanner;

public class PrintASSCI {
public static void main(String[] args) {
	char ch;
	System.out.println("enter an character");
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	int a=ch;
	System.out.println("ASCII value " + ch + "is" + a);
	
}
}
