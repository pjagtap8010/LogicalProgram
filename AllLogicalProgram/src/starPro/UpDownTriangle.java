package starPro;

public class UpDownTriangle {
	
	public static void main (String [] args) {
		
		
		 int a = 5;
		 
		 for (int i=0; i<=a; i++) {
			 
			 
			 for (int j=i; j<=a; j++) {
				 
				 System.out.print("  ");			 
			 }
			 
			 
			 for (int k=0; k<=i; k++) {
				 
				 System.out.print("# ");
			 }
			 
			 
			 System.out.println();
		 }
		 
		
         for (int i=0; i<=a+1; i++) {
			 
			 
			 for (int j=0; j<=i-1; j++) {
				 
				 System.out.print("  ");
				 
			 }
			 
        for (int j=i; j<=a+1; j++) {
				 
				 System.out.print("# ");			 
			 }
        
			 
			 System.out.println();
		 }
		
		
		
	}

}
