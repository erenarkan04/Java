import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex74 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		String n = input.nextLine(); 
		
		System.out.println(getStringAlt(n) ? "is Palindrome" : "is Not Palindrome");
		
		//test1(); 
		//test2(); 
		//test3(); 
		//test4(); 
		//test5(); 
}

	public static String getString (String n) {
	 
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

// 	V2 of code (simpler)

	public static boolean getStringAlt (String n) {
		
		boolean isPalindrome = true; 
		
		for (int i = 0, j = n.length() - 1; i < j; i++, j--) {
			if (n.charAt(i) == n.charAt(j)) 
				continue;

			isPalindrome = false; 
			break;  
		}

		return isPalindrome; 
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
}




	

