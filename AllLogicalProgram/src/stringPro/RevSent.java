package stringPro;

public class RevSent {

	public static void main (String [] args) {
		
		String p = "hii how are you";
		
		String [] p1 = p.split(" ");
		
		for (int i=p1.length-1; i>=0; i--) {
			
			System.out.print(p1[i]+ " ");
			
			
		}
		
		
		
		
		
		
	}
	
}
