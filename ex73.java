import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex73 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		String n = input.nextLine(); 
		
		System.out.println(getString(n));
		
		test1(); 
		test2(); 
		test3(); 
}

	public static String getString (String n) {
	
		String origString = n; 
		String reverseString = ""; 

		int stringLength = n.length(); 
		
		for (int i = stringLength - 1; i >= 0; i--) {
			reverseString += n.charAt(i); 
		}

		(origString = reverseString?) return "is Palindrome" : return "is not Palindrome";
	}

	public static void test1 () {
		assertEquals(getString("a"), "a"); 
	}
	public static void test2 () {
		assertEquals(getString("abc"), "cba"); 
	}
	public static void test3 () {
		assertEquals(getString("abc abc"), "cba cba"); 
	}
}




	

