import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;


public class ex57 {

	public static void main (String[] args) {


		Scanner input = new Scanner(System.in); 

		int inputOne = input.nextInt(); 
		char inputTwo = input.next().charAt(0);
		int inputThree = input.nextInt();
		
		System.out.println(calcFunction(inputOne, inputTwo, inputThree)); 


	addTest(); 
	subTest ();
	multTest ();
	divTest ();

	}


	public static int calcFunction (int a, char b, int c) {
		
		if (b == '+') 
			return a + c; 
		else if (b == '-') 

			return a - c; 
		else if (b == '*')
			return a * c;
		else if (b == '/')
			return a / c; 
		else return 0; 


	}




	public static void addTest () {
		assertEquals(calcFunction(1, '+', 2), 3); 
	}

	public static void subTest () {
		assertEquals(calcFunction(3, '-', 2), 1); 
	}

	public static void multTest () {
		assertEquals(calcFunction(2, '*', 2), 4); 
	}

	public static void divTest () {
		assertEquals(calcFunction(4, '/', 2), 2); 
	}
}
