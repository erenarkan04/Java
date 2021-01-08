import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex85 {

	public static void main (String[] args) {
	

	int lowerBound = getLowerBound(); 
 	int upperBound = getUpperBound(); 


	printPrimeNumbers(lowerBound, upperBound); 

	}

	
	public static int  getLowerBound () {
		
		System.out.println("Enter lower bound" );
	
		return new Scanner(System.in).nextInt(); 
	} 

	public static int  getUpperBound () {

		System.out.println("Enter upper bound" );
	
		return new Scanner(System.in).nextInt(); 
	} 

	public static void printPrimeNumbers (int x, int y) {
		

		for (int i = x; i < y; i++) {
			boolean isPrime = true; 
			for (int n = 2; n < i; n++) {
				if (i % n == 0) 
					isPrime = false; 
			}

		if (isPrime) System.out.println(i); 
		}
		
	} 


	public static boolean isPrime (int x) { 
		
		boolean isPrime = true; 
		for (int i = 0; i < x; i++) { 
				if (x % i == 0)
					isPrime = false; 
		}
		return isPrime; 
}




	

