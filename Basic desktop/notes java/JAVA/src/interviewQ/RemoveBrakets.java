package interviewQ;

public class RemoveBrakets {
	public static void main(String[] args) {
	
     String s="Vinay[]KC";
     String a=s.replace("[", "");
     String b=a.replace("]", " ");
    System.out.println(b);
	}
}
