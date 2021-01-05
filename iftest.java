import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class iftest {
	
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 

		System.out.println("Enter input"); 

		int value = input.nextInt();	 

		System.out.println(value + generateString(value)); 
		
		evenTest(value);
		
	}

	public static String generateString (int x) {
		
		String string; 		
		
		if (x % 2 == 0) 
			string = " is even";
		
		else string = " is odd";
		
		return string; 
	}

	public static void evenTest (int x) {
		if (x % 2 == 0) 
			assertEquals(generateString(x), " is even"); 

		else assertEquals(generateString(x), " is odd");
	}

}

