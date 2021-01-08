import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex78 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int n = input.nextInt(); 
		
		for (int i = 0; i <= n; i++) {
			
/*			for (int k = 0; k < n; k++) {
				if (i == n || i == 0) { 
					System.out.print("*");
					continue; }
				if (k == 0) System.out.print("*");
				if (k < n - 2) System.out.print(" ");									
				if (k == n - 1) System.out.print("*"); 


			
			}
*/
			if (i == 0 || i == n) {
				for (int k = 0; k < n; k++) {
					System.out.print("*");
				}
			}
			else { 
				for (int k = 0; k < n; k++) { 
					if (k == 0 || k == n - 1) { 
						System.out.print("*");
					} 
					else System.out.print(" ");
				}
			} 
			
			System.out.println(); 
		}

		//test1(); 
		//test2(); 
		//test3(); 
		//test4(); 
		//test5(); 
}

/*
	public static String numbersFunction (String n) {
	 
		String reverseString = ""; 

		int stringLength = n.length(); 
		
		for (int i = stringLength - 1; i >= 0; i=i-1) {
			reverseString += n.charAt(i); 
		}

		String response = ""; 

		if (n.equals(reverseString)) {
		
			response = "is Palindrome";
		} else {
			response = "is not Palindrome";
		}
	
		return response; 
	}


	public static void test1 () {
		assertEquals(getStringAlt("a"), "is Palindrome"); 
	}
	public static void test2 () {
		assertEquals(getStringAlt("aba"), "is Palindrome"); 
	}
	public static void test3 () {
		assertEquals(getStringAlt("aba aba"), "is Palindrome"); 
	}
	public static void test4 () {
		assertEquals(getStringAlt("abc"), "is not Palindrome"); 
	}
	public static void test5 () {
		assertEquals(getStringAlt("abc abc"), "is not Palindrome"); 
	}
*/
}




	

