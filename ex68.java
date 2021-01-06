import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex68 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int n = input.nextInt(); 
		
		System.out.println(n + " " + (returnPrime(n)? " is Prime" : " is not Prime"));

		primeTest(); 
		notPrimeTest();
	}

/*
	public static String returnPrime (int n) {

		int sum = 0; 

		for (int i = 2; i < n; i++) {
			if (n % i == 0) 
				sum += i; 
		}

		if (sum == 0)
			return "is Prime";
		else return "is not Prime";
	}
*/

	public static boolean returnPrime (int n) {
		boolean isPrime= true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			} 
		}
		return isPrime;
	}



	public static void primeTest () {
		assertEquals(returnPrime(7), true); 
	}
	public static void notPrimeTest () {
		assertEquals(returnPrime(10), false); 
	}
}



	

