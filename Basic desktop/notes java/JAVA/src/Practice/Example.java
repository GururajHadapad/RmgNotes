package Practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Example {
public static void main(String[] args) {

	String s1="vinay";
	String s2="kc";
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
}
}

	
	
	
	