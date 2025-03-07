package arithmeticPro;

public class SecondLargeNo {
	
	public static void main (String [] args) {
		
		        
		        int [] a = {56,11,13,55,23,66};
		        int temp;
		        
		        for (int i=0; i<=a.length-1; i++){
		            
		        for (int j=i+1; j<=a.length-1; j++){
		            
		            if (a[i]<a[j]){
		            temp = a[i];  
		            a[i] =  a[j];  
		            a[j]  = temp; 
		            
		            }     
		        }    
		            
		         
		        }
		        
		        System.out.print(a[1]); 
		        
		    }
			
	}


