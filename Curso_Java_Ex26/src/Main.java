import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in); 

int N; 
int i; 

N= sc.nextInt(); 


for (i=1; i<=N; i++) {
	
	if (N%i==0) {
		System.out.printf("%d%n", i); 
	}
       }



      sc.close(); 
	}

}
