import java.util.Locale; 
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		int N, H; 
		double S, C; 
		
		N=sc.nextInt(); 
		H=sc.nextInt(); 
		C=sc.nextDouble();
		
		S = H*C; 
		
		System.out.printf("NUMBER = %d%n", N);
		System.out.printf("SALARY = U$ %.2f%n", S);
	
		
		sc.close(); 
	
	}

}
