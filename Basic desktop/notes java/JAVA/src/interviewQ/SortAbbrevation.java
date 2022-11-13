package interviewQ;

public class SortAbbrevation {
public static void main(String[] args) {
	String s="shubham kumar dev";
	String[] str=s.split(" ");
	String rev="";
	for(String c:str) {
		rev=c.substring(0,1);
	   String upper=rev.toUpperCase();
	System.out.print(upper);
}
}

}