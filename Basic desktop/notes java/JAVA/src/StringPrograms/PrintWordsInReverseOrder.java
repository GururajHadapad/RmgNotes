package StringPrograms;

import java.util.LinkedHashSet;

public class PrintWordsInReverseOrder {
public static void main(String[] args) {
	String s="khatam ta ta bye bye";
	String[] str=s.split(" ");
    for(int i=str.length-1;i>=0;i--) {
    	System.out.print(str[i]+" ");
    }
} 
}
