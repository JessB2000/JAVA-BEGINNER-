import java.util.Locale; 
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		double A, B, C, ATri, AC, Atra,AQ, AR;
		
		
		A=sc.nextDouble(); 
		B=sc.nextDouble();
		C=sc.nextDouble();
		
		ATri=(A*C)/2; 
		AC= 3.14159*(C*C);
		Atra= ((A+B)*C)/2;
		AQ= B*B;
		AR= A*B; 
		
		System.out.printf("TRIANGULO: %.3f%n", ATri); 
		System.out.printf("CIRCULO: %.3f%n", AC); 
		System.out.printf("TRAPEZIO: %.3f%n", Atra); 
		System.out.printf("QUADRADO: %.3f%n", AQ); 
		System.out.printf("RETANGULO: %.3f%n", AR); 
		
		sc.close();
		
		
	}

}
