//problema 1021 do URI dando wrong answer 
import java.util.Locale;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		double A; 
		double B; 
		int notas100;
		int notas50;
		int notas20; 
		int notas10;
		int notas5; 
		int notas2; 
		int moedas1;
		int moedas50; 
		int moedas25;
		int moedas10;
		int moedas5; 
		int moedas1c; 
		
		A= sc.nextDouble(); 
		
		
	notas100= (int)A/100; 
	notas50= (int)(A%100)/50; 
	notas20= (int)((A%100)%50)/20; 
	notas10= (int)(((A%100)%50)%20)/10; 
	notas5= (int)((((A%100)%50)%20)%10)/5;
	notas2= (int)(((((A%100)%50)%20)%10)%5)/2; 
	moedas1=(int)((((((A%100)%50)%20)%10)%5)%2)/1; 
	B= A *100; 
	moedas50= (int) (B%100)/50; 
	moedas25= (int) ((B%100)%50)/25; 
	moedas10= (int) (((B%100)%50)%25)/10; 
	moedas5=  (int) ((((B%100)%50)%25)%10)/5;
	moedas1c= (int) (((((B%100)%50)%25)%10)%5)/1; 
	
	System.out.printf("NOTAS:%n"); 
	System.out.printf("%d nota(s) de R$ 100.00%n", notas100); 
	System.out.printf("%d nota(s) de R$ 50.00%n", notas50);
	System.out.printf("%d nota(s) de R$ 20.00%n", notas20);
	System.out.printf("%d nota(s) de R$ 10.00%n", notas10); 
	System.out.printf("%d nota(s) de R$ 5.00%n", notas5);
	System.out.printf("%d nota(s) de R$ 2.00%n", notas2); 
	
	System.out.printf("MOEDAS:%n"); 
	System.out.printf("%d moedas(s) de R$ 1.00%n", moedas1); 
	System.out.printf("%d moedas(s) de R$ 0.50%n", moedas50); 
	System.out.printf("%d moedas(s) de R$ 0.25%n", moedas25); 
	System.out.printf("%d moedas(s) de R$ 0.10%n", moedas10); 
	System.out.printf("%d moedas(s) de R$ 0.05%n", moedas5); 
	System.out.printf("%d moedas(s) de R$ 0.01%n", moedas1c);  
	
		
		sc.close(); 
	}

}

