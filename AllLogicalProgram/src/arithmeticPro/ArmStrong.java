package arithmeticPro;

public class ArmStrong {
	
	 public static void main (String [] args) {
		 
		 int a = 123;  // 1^3+ 2^3 + 3^3
		 int rem =0;
		 int rev =0;
		 
		 while(a!=0) {
			 
			 rem = a%10;
			 rev = rev + rem*rem*rem;
			 a = a/10;
			 			 
			 
		 }
		 
		 System.out.print(rev);
		 
	 }

}
