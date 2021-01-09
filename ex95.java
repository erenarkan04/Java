import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*; 
import java.util.*; 
import java.awt.*;

public class ex95 {

	public static void main (String[] args) {

	int[] intArray = {1, 2, 3, 4, 5}; 

	System.out.println("min: " + getMin(intArray) + " " + "max: " + getMax(intArray)); 

	test1(intArray);
	test2(intArray);


	}

	public static int getMin (int[] y) {	
		int min = y[0]; 

		for(int i = 0; i < y.length; i++) {

			if (y[i] < min) min = y[i]; 
		}

		return min; 
	} 

	
	public static int getMax (int[] y) {	
		int max = y[0]; 

		for(int i = 0; i < y.length; i++) {

			if (y[i] > max) max = y[i]; 
		}

		return max; 
	} 


	public static void test1 (int[] x) {
		assertEquals(getMin(x), 1);
	
	} 

	public static void test2 (int[] x) {
		assertEquals(getMax(x), 5);
	} 

}




	

