package stringPro;

public class SpecificChar {
	
	public static void main(String[] args) {
		
	
	 String a = "hii how are you";
	 
	 String[] arr = a.split(" ");		 		
	 
	 System.out.println(arr.length); 

     for (int i=0; i<arr.length; i++) {
    	 
    	 if (arr[i].toUpperCase().equals("HOW")) {
    		 
    		 System.out.println("Hii");
    	 }
     }
}}
