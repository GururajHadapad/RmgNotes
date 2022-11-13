package interviewQ;

public class StringClass {
public static void main(String[] args) {
	String s1="abc";
	String s2="abc";
	String s3="xyz";
	System.out.println(s1==s2);
	s1=s1+"mno";
	System.out.println(s1==s2);
}
}
