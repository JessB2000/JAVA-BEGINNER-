import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		int c; 
		int a=0;
		int g=0; 
		int d=0; 
		
		c=sc.nextInt();
		
		while (c!=4) {
			
			if (c==1) {
				
				a++; 
			}
			
			else if (c==2) {
				
				g++; 
			}
			
			else if (c==3) {
				d++; 
			}
	
			
			else if (c==4) {
				
				System.out.printf("MUITO OBRIGADO%n");
				System.out.printf("Alcool: %d%n", a);
				System.out.printf("Gasolina: %d%n", g); 
				System.out.printf("Diesel: %d%n",d); 
			}
			
			c=sc.nextInt(); 
			
		}

			
			System.out.printf("MUITO OBRIGADO%n");
			System.out.printf("Alcool: %d%n", a);
			System.out.printf("Gasolina: %d%n", g); 
			System.out.printf("Diesel: %d%n",d); 
		
		
		sc.close(); 

	}

}
