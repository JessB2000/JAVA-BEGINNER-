import java.util.Locale;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US); 
		 Scanner sc = new Scanner (System.in); 
		 
		 int C, Q; 
		 
		 double Pf;
		 
		 C= sc.nextInt();
		 Q= sc. nextInt(); 
		 
		 if (C==1) {
			 Pf = 4.00*Q; 
			 System.out.printf("Total: R$ %.2f%n", Pf); 
			 
		 }
		 
		 else if (C==2) {
			 
			 Pf = 4.50* Q; 
			 System.out.printf("Total: R$ %.2f%n", Pf); 
		 }
		 
		 else if (C==3) {
			 
			 
			Pf = 5.00* Q; 
			 System.out.printf("Total: R$ %.2f%n", Pf); 
			 
		 }
		 
		 else if (C==4) {
			 
			 Pf=2.00* Q; 
			 System.out.printf("Total: R$ %.2f%n", Pf); 
			 
		 }
		 
		 else if (C==5) {
			 Pf=1.50* Q; 
			 System.out.printf("Total: R$ %.2f%n", Pf); 
		 }
		 
		
		 
		 sc.close();
		 
			 
		 
	}

}
