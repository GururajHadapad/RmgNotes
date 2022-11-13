 package StringPrograms;

public class ReverseStringWithOutLengthMethod {
public static void main(String[] args) {
	String s="Vinay";
    char[] rev=s.toCharArray();
	int count=0;
	for (char c : rev) {
		count++;
	}
	for(int i=count-1; i>=0; i--) {
	
	System.out.println(s.charAt(i));
}
}
}