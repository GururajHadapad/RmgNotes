package interviewQ;

public class postionOfWord {
	public static void main(String[] args) {
		String s="Bangalore";   //Ba6e
		int count=0;
		for(int i=1;i<s.length()-2;i++) {
		count++;
		}
		System.out.println(s.charAt(0)+""+s.charAt(1)+count+s.charAt(8));
		
//		s=s.substring(0,1)+(s.length()-2)+s.substring(s.length()-1);
//		System.out.println(s);
	}
	
}
