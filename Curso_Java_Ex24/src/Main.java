import java.util.Locale;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in); 
		
		int N; 
		int num1;
		int num2; 
		int i; 
	    double result; 
		
		N=sc.nextInt(); 
		
		for (i=0; i<N; i++) {
			
			num1=sc.nextInt();
			num2=sc.nextInt(); 
		
			
			if (num2==0) {
				System.out.printf("divisao impossivel%n"); 
			}
			
			else {
				result = (double)num1/(double)num2; 
				System.out.printf("%.1f%n", result); 
			}
		}
	}

}
