import java.util.Locale;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		int N; 
		double N1;
		double N2; 
		double N3; 
		double result; 
		
		N=sc.nextInt();
		
		for (int i= 0; i < N; i++) {
			
			N1=sc.nextDouble();
			N2= sc.nextDouble();
			N3= sc.nextDouble(); 
			
			result= ((N1*2)+(N2*3)+(N3*5))/10; 
			
		 System.out.printf("%.1f", result); 
		}
		
		sc.close(); 
	}

}
