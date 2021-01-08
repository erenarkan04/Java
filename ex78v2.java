import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex78v2 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int n = input.nextInt(); 
		
		for (int i = 0; i <= n; i++) {

			if (i == 0 || i == n) {
				for (int k = 0; k < n; k++) {
					System.out.print("*");
				}
			}
			else { 
				System.out.print(" ");
				for (int k = 0; k < n - 2; k++) { 
						System.out.print("*");
				}
			} 
			
			System.out.println(); 
		}

	}


}




	

