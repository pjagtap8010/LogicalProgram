package arithmeticPro;

public class Fibonacci {
	
	
	   public static void main (String [] args) {
		   
		   int a = 0; 
		   int b =1;
		   int c = 0;
		   
		   
		   while(c<=14) {
			   
			   System.out.print(c+ " ");
			   
			   c = a + b;
			   a=b;
			   b=c;
			   
			
			   
			   
		   }
		   
		   
		   
		   
		   
		   
	   }

}
