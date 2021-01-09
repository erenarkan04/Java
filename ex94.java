import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*; 
import java.util.*; 
import java.awt.*;

public class ex94 {

	public static void main (String[] args) {

	int[] intArray = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5}; 

	int input = new Scanner(System.in).nextInt(); 

	System.out.println(input + " " + "occurs" + " " + getOccur(input, intArray) + " " + "times"); 

	test1(intArray);
	test2(intArray);
	test3(intArray); 


	}

	public static int getOccur (int x, int[] y) {	
		int occurences = 0; 

		for (int i = 0; i < y.length; i++) { 
			if (x == y[i]) occurences += 1; 
		}
		return occurences; 
	} 


	public static void test1 (int [] x) {
		assertEquals(getOccur(2, x), 2);
	
	} 

	public static void test2 (int [] x) {
		assertEquals(getOccur(4, x), 4);
	} 

	 
	public static void test3 (int [] x) {
		assertEquals(getOccur(5, x), 5);
	
	} 
}




	

