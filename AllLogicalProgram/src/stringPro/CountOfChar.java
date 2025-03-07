package stringPro;

public class CountOfChar {
	
	 public static void main (String [] args) {
		 
		 String p = "hii pratik how ar you";
		 int count = 0;
		 char c = 'h';
		 
		 
		 for (int i=0; i<=p.length()-1; i++) {
			 
			 
			 if (p.charAt(i)==c) {
				 
				 
				count++; 
				 
			 }		 		 
		 }		 
		System.out.print(count); 
		 		 
	 }
			 
}
