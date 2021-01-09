import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*; 
import java.util.*; 
import java.awt.*;

public class ex93 {

	public static void main (String[] args) {

	int[] intArray = {1, 2, 3, 4, 5}; 

	System.out.println("Sum :" + sumArray(intArray)); 
	System.out.println("Prod :" + prodArray(intArray)); 
	System.out.println("Avg :" + avgArray(intArray)); 

	sumTest();
	prodTest();
	avgTest(); 


	}

	public static int sumArray (int[] y) {
		int sum = 0; 		
		for (int i = 0; i < y.length; i++) { 
			sum += y[i]; 
		}
		return sum; 
	} 

	
	public static int prodArray (int[] y) {
		int prod = 1; 		
		for (int i = 1; i < y.length; i++) { 
			prod *= y[i]; 
		}
		return prod;
	} 

	
	public static int avgArray (int[] y) { 
		int sum = 0; 		
		for (int i = 0; i < y.length; i++) { 
			sum += y[i]; 
		}
		return (sum/y.length); 
	} 


	public static void sumTest () {
		assertEquals(sumArray(new int[] {1, 2, 3, 4}), 10);
	
	} 

	public static void prodTest () {
		assertEquals(prodArray(new int[] {1, 2, 3, 4}), 24);
	} 

	 
	public static void avgTest () {
		assertEquals(avgArray(new int[] {2, 4, 6, 8}), 5);
	
	} 
}




	

