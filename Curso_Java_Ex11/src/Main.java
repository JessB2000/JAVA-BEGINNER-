import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		int A; 
		
	  A= sc.nextInt(); 
	  if (A<0) {
		  System.out.println("NEGATIVO"); 
	  }
	  else {
		  System.out.println("POSITIVO"); 
	  }
	  sc.close();

	}

}
