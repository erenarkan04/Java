import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex66 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int sum = 0;

		do {
			int n = input.nextInt(); 
			sum += n; 
			
		} while (sum < 100); 

		System.out.println("done"); 
	}


}

	

