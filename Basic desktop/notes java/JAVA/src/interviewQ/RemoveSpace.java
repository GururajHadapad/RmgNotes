package interviewQ;

public class RemoveSpace {

	public static void main(String[] args) {
		 String s="Vinay   KC";
		 int l=s.length();
		 int count=0;
		 String str="";
		 for (int i = 0; i <l; i++) {
			if(s.charAt(i)==32)
			{
				count++;
			}
			if(count>=1)
			{
				for (int j = 0; j <count-2; j++) {
					
					str=s.replace(" ", "");
				}
			}
		}
		 
		 System.out.println(str);
	}

}
