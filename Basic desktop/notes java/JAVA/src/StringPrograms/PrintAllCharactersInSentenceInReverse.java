package StringPrograms;

public class PrintAllCharactersInSentenceInReverse {
public static void main(String[] args) {
	String s="khatam ta ta bye bye";
	String[] str = s.split(" ");
	for (String c : str) {
		
	for(int i=c.length()-1;i>=0;i--) {
		System.out.print(c.charAt(i));
	}
	
	System.out.print(" ");
}
}
}
