package interviewQ;

public class Stringoccurance {

	public static void main(String[] args) {
		String s="v2i3y1";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				for(int j=0;j<s.charAt(i)-48;j++) {
					System.out.println(s.charAt(i-1));
				}
			}
		}
	}
}
