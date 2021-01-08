import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex85v2 {

	public static void main (String[] args) {

	printPrimeBetween(2, 40); 

	isPrimeTest1();
	isPrimeTest2();
	isPrimeTest3();
	isPrimeTest4(); 

	}

	public static void  printPrimeBetween (int x, int y) {
		
		for (int i = x; i < y; i++) { 
			if (isPrime(i)) System.out.println(i); 
		}
	} 


	public static boolean isPrime (int x) { 
		
		for (int i = 2; i < x; i++) { 
				if (x % i == 0) return false; 
		}
		return true; 
	}

	public static void isPrimeTest1 () {
		assertEquals(isPrime(5), true); 
	}

	public static void isPrimeTest2 () {
		assertEquals(isPrime(6), false); 
	}	

	public static void isPrimeTest3 () {
		assertEquals(isPrime(17), true); 
	}
	public static void isPrimeTest4 () {
		assertEquals(isPrime(20), false); 
	}

}




	

