import java.util.Scanner; 
import java.util.Locale; 

public class Main {

	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
      Scanner sc= new Scanner (System.in); 
      double r; 
      
      double pi= 3.14159; 
      
      double A; 
      
      r=sc.nextDouble(); 
      
      A=pi*r*r; 
      
      System.out.printf("A=%.4f%n", A); 
      
      sc.close();
      
      
	}

}
