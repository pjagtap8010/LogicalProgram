package stringPro;

public class SplChar {

	public static void main (String [] args) {
		
	
	   String p = "hiipra&^%%^98HgrFE";
	   
	   String p1 = p.replaceAll("[^a-zA-Z0-9]", " ");
	   
	   System.out.print(p1);
	   
 }	   
	   
}
