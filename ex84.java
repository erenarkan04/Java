import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex84 {

	public static void main (String[] args) {
	

	int lowerBound = getLowerBound(); 
 	int upperBound = getUpperBound(); 


	printPrimeNumbers(lowerBound, upperBound); 

	}

	
	public static int  getLowerBound () {
	
		return new Scanner(System.in).nextInt(); 


	} 

	public static int  getUpperBound () {
	
		return new Scanner(System.in).nextInt(); 


	} 

	public static void  printPrimeNumbers (int x, int y) {
	
		for (i = x; i < y; i++) {
			for (n = 2; n > i; n++) {
				if (i % n == 0)
					break; 
				System.out.print(i); 
			}
		} 


	} 

}




	

