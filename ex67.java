import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex67 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int n = input.nextInt(); 
		
		System.out.println(returnSumOfDivisors(n));

		sumTest(); 
	}

	public static int returnSumOfDivisors (int n) {
		int sum = 1; 
		
		for (int i = n/2; i > 1; i--) {
			if (n % i == 0) 
				sum += i;  
		}
		return sum; 
	}

	public static void sumTest () {
		assertEquals(returnSumOfDivisors(10), 8); 
	}
}




	

