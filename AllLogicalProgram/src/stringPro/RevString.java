package stringPro;

public class RevString {
	
	public static void main (String [] args) {
		
		String p = "hii pratik how are you";
		
		for (int i=p.length()-1; i>=0; i--) {
			
			System.out.print(p.charAt(i));
			
		}
	}

}
