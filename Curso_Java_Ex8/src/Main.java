import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		int A,B,C,D,Df; 
		
		A=sc.nextInt(); 
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		
		Df=(A*B)-(C*D); 
		
		System.out.printf("DIFERENCA = %d%n", Df); 
	
		
		sc.close();

	}

}
