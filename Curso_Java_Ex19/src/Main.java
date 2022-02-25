import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		int X, Y; 
		
		X=sc.nextInt();
		Y=sc.nextInt();
		
		while (X != 0 || Y!=0) {
			
			if (X>0 && Y>0 ) {
				System.out.printf("primeiro%n");
				
			}
			
			else if (X<0 && Y>0) {
				System.out.printf("segundo%n"); 
			}
			
			else if (X<0 && Y<0) {
				
				System.out.printf("terceiro%n");
				
			}
			
			else if (X>0 && Y<0) {
				
				System.out.printf("quarto%n"); 
			}
			
			else if (X==0 || Y==0) {
				break; 
			}
			
			X=sc.nextInt();
			Y=sc.nextInt();
			
		}	

	}

}
