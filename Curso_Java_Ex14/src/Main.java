import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in); 
		
		int A, B; 
	    int result; 
	    
	    A=sc.nextInt();
	    B= sc.nextInt();
	    
	    if (A>B) {
	    	
	    	result = 24 - A+B; 
	    	 System.out.printf("O JOGO DUROU %d HORA(S)%n", result); 
	    	
	    }
	    
	    else if (B>A) {
	
	    	
	    	result = B-A; 
	    	
	    	 System.out.printf("O JOGO DUROU %d HORA(S)%n", result); 
	    }
	    
	    else if (B==A) {
	    	 System.out.printf("O JOGO DUROU 24 HORA(S)%n"); 

	    }
	    sc.close();
	    
	}
	

}
