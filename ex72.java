import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex72 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		String n = input.nextLine(); 
		
		System.out.println(getString(n));
		
		test1(); 
		test2(); 
		test3(); 
}

	public static String getString (String n) {
	
		String input = n; 

		String inputMod = ""; 

		int stringLength = n.length(); 
		
		for (int i = 0; i < stringLength; i++) {
			inputMod += n.charAt(i) + " "; 
		}

		return inputMod; 
	}

	public static void test1 () {
		assertEquals(getString("a"), "a "); 
	}
	public static void test2 () {
		assertEquals(getString("abc"), "a b c "); 
	}
	public static void test3 () {
		assertEquals(getString("abc abc"), "a b c   a b c "); 
	}
}




	

