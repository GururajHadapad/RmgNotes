package interviewQ;

public class NotMultipleBy5 {
public static void main(String[] args) {
	int a=100;
	for(int i=0; i<a; i++) {
		if(i%5==0) {
			continue;
			//break;
		}
		System.out.println(i);
	}
}
}
