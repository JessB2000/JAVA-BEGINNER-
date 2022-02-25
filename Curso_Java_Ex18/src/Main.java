import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in); 

int s; 

s=sc.nextInt(); 

while (s!=2002) {
	
	System.out.printf("Senha Invalida%n"); 
	
	s=sc.nextInt(); 
	
	if (s==2002) {
		
		System.out.printf("Acesso Permitido%n"); 
		break; 
	}
	
}

sc.close(); 
	}

}
