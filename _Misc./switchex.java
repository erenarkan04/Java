import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;


public class switchex {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in); 

		int x = input.nextInt(); 

		System.out.println(x + returnString(x));

		evenTest(); 
		oddTest(); 

	}


	public static String returnString (int n) {
	
		String string; 

		switch (n % 2) {
			case 0: 
				string = " is even";
				break; 

			default: 
				string = " is odd";  
		}
		return string; 
	}




	public static void evenTest () {
		assertEquals(returnString(2), " is even");
	}

	public static void oddTest () {
		assertEquals(returnString(3), " is odd");
	}


}
