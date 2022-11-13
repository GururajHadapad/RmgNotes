package StringPrograms;

public class NumberPallidrom {
public static void main(String[] args) {
	int a=1211;
	int b=a;
	int rev=0;
	while(a!=0){
	 int c=a%10;
	 rev=rev*10+c;
	 a=a/10;
	}
	if(rev==b){
	System.out.println("number is pall");
	}else{
	System.out.println("number is not pall");
	}
	}
	}