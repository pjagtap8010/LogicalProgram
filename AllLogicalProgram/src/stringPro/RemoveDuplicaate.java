package stringPro;

public class RemoveDuplicaate {
	
	
	 public static void main (String [] args) {
		 
		 String p= "hii how are you";
		 String result = "";

		 
		 for (int i=0; i<=p.length()-1; i++) {
			 
		   String ch = ""+ p.charAt(i);
			 
		      if (result.contains(ch)) {
		    	   
		    	  continue;
		    	  
		    	  
		      }
			  
		      result += ch;
		 }
		 
		 System.out.print(result);
		 	 
	 }

}
