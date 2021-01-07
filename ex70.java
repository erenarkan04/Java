import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex70 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int n = input.nextInt(); 
		
		System.out.println(returnSumOfDigits(n));
		

		sumTest1(); 
		sumTest2(); 

	}

	public static int returnSumOfDigits (int n) {
	
		int length = String.valueOf(n).length(); 
		int sum = 0;  

		if (n <= 0) sum = 0; 
		else {
			while (n > 0) {	
				sum += n % 10;
				n /= 10; 	
			}
		}
		return sum; 
	}





	public static void sumTest1 () {
		assertEquals(returnSumOfDigits(12345), 15); 
	}
	
	
	public static void sumTest2 () {
		assertEquals(returnSumOfDigits(00000), 0); 
	}


}




	

