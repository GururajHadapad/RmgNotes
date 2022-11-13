package interviewQ;

public class StringName {

	public static void main(String[] args) {
		String s="vinaynaidu";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.print(s.toUpperCase().charAt(i)+" ");
			}else {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}
