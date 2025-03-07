package arithmeticPro;

public class MaxNo {
	
	public static void main(String[] args) {
		
		 int [] a = {1,4,5,10, 12, 6,6,7,8,9};
		 int max=0;
	
		 
		 for (int i=0; i<=a.length-1; i++) {
			 
			 if (max< a[i]) {
				 
				 max = a[i];
				 
			 }
			 
			 
		 }
		 
		System.out.print(max);
	}

}
