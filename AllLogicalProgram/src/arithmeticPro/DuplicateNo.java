package arithmeticPro;

public class DuplicateNo {
	
	public static void main(String[] args) {
		
		int [] a = {1,1,2,3,3,4,4,4,4,5};
		int j=1;
		
		    System.out.print(a[0]);
		    
		 for (int i=0; i<=a.length-1; i++){
		
			 if (a[j]!=a[i]) {
				 
				 a[j+1]= a[i];
				 j++;
				 
				 System.out.print(a[i]);
				 
			 }
			 
			 
			 
			 
		 }
		
	}

}
