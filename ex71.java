import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex71 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
	 
		int n = input.nextInt(); 
		
		System.out.println(getFib(n));
		
		sumTest1(); 
		sumTest2(); 
		sumTest3(); 
		sumTest4(); 
		sumTest5(); 			

}

	public static int getFib (int n) {
	
		int indexC = 0;  
		int indexP = 1; 
		int indexPP = 1; 

		if (n == 1 || n == 2) {
			indexC = 1; 
		} else {
			for (int i = 0; i < n - 2; i++) {
				indexC = indexP + indexPP; 
				indexPP = indexP; 
				indexP = indexC; 
			}
		}
		return indexC; 
	}

	public static void sumTest1 () {
		assertEquals(getFib(1), 1); 
	}
	public static void sumTest2 () {
		assertEquals(getFib(2), 1); 
	}
	public static void sumTest3 () {
		assertEquals(getFib(3), 2); 
	}
	public static void sumTest4 () {
		assertEquals(getFib(4), 3); 
	}
	public static void sumTest5 () {
	assertEquals(getFib(8), 21); 
	}
}




	

