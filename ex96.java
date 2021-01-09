import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*; 
import java.util.*; 
import java.awt.*;

public class ex96 {

	public static void main (String[] args) {

	int[] intArray = {1, 2, 3, 7, 7, 6, 7, 8, 9, 10, 7, 12};

	System.out.println(reorderArray(intArray)); 

	//test1(intArray);
	//test2(intArray);


	}

	public static String reorderArray (int[] y) {	
		
		int [] newArray = new int[y.length]; 
		int n = 0;     
		int z = y.length - 1; 

		for(int i = 0; i < y.length; i++) {
			
			if (y[i] % 2 != 0) {
				newArray[n++] = y[i];
				
			}
			else {
				newArray[z--] = y[i];
				
			} 
		}

		return Arrays.toString(newArray); 
	} 

	

}




	

