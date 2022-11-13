package StringPrograms;

public class ReverseStringWithOutLengthMethodAndStoreInAnotherVariable {
public static void main(String[] args) {
	String s="Vinay";
	String rev="";
	char[] d=s.toCharArray();
	int count=0; 
	for (char c : d) {
		count++;
	}
	for(int i=count-1; i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
}
}
