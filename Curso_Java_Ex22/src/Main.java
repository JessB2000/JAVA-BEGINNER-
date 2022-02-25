import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		int N; 
		int num; 
		int i; 
		int in=0; 
		int out=0; 
		
		N=sc.nextInt();
		
		for (i=0; i<N; i++) {
			
			num=sc.nextInt();
			
			if (num>=10 && num <=20) {
				in++; 
			}
			
			else {
				out++; 
			}
		}
		
		System.out.printf("%d in%n", in); 
		System.out.printf("%d out%n", out); 
		
		sc.close(); 

	}

}
