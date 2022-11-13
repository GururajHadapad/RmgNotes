package interviewQ;

public class AddString {
public static void main(String[] args) {
	String s="234aa";
//	int sum=0;
//	int num=0;
	for(int i=0; i<s.length();i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			
		
   try {
	   int number=Integer.parseInt(s);
	   System.out.println(number);
   }catch(Exception e) {
	
   }
	}
}
}

}