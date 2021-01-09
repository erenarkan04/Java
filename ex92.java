import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*; 
import java.util.*; 
import java.awt.*;

public class ex92 {

	public static void main (String[] args) {
	
	int n = new Scanner(System.in).nextInt(); 

	int[] array = new int[n]; 

	if (n < 1 || n > 20) System.out.println("Enter a number between 1 & 20"); 

	else {

		fillIntArray(n, array); 

		System.out.println(Arrays.toString(array)); 
	}

	}

	public static void fillIntArray (int x, int[] y) {
		
		for (int i = 0; i < x; i++) {
			y[i] = new Scanner(System.in).nextInt(); 
			
		} 
	} 

}




	

