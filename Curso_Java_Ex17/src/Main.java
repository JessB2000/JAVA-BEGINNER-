import java.util.Locale;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		double s; 
		double sf; 
		
		s=sc.nextDouble();
		
		if ((0.00<=s)&&(s<=2000.00)) {
			System.out.printf("Isento%n");
		}
		
		else if ((2000.01<=s)&&(s<=3000.00)) {
			sf=(s-2000.00)*0.08; 
			System.out.printf("R$ %.2f%n",sf); 
			
		}
		
		else if ((3000.01<=s)&&(s<=4500.00)) {
			sf=(s-3000.00)*0.18+1000.00*0.08; 
			System.out.printf("R$ %.2f%n",sf); 
		}
		
		else if (s>4500.00) {
			
			sf=(s-4500.00)*0.28+1500.00*0.18+1000.00*0.08;
			
			System.out.printf("R$ %.2f%n",sf); 
		}
		
		sc.close();
		
	}

}
