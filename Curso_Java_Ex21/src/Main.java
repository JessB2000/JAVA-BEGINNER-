import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner (System.in); 
      
      int X; 
      int i; 
      
      X=sc.nextInt(); 
      
      for (i=1; i<=X; i++) {
    	  
    	  if (i%2!=0) {
    		  
    		  System.out.printf("%d%n",i); 
    	  }
      }
      
      sc.close(); 
	}

}
