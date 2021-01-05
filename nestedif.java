import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;


public class nestedif {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n = input.nextInt(); 
		
		System.out.println(generateString(n));



		lessThanTest();
		equalToTest(); 	
		greaterThanTest(); 
	

	}

	public static String generateString (int n) {
		
		String string; 

		if (n > 10) 
			string = " >10"; 
		else if (n == 10)
			string = " =10";
		else 
			string = " <10";

		return string; 
	}


	public static void lessThanTest () {
		assertEquals(generateString(5)," <10"); 
	} 

	public static void equalToTest () {
		assertEquals(generateString(10)," =10"); 
	} 


	public static void greaterThanTest () {
		assertEquals(generateString(15)," >10"); 
	} 


}
