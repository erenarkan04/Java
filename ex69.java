import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ex69 {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 
		int x = input.nextInt();  
		int y; 		
		int maxValue = x; 
		int minValue = x; 

		if (x >= 0) {
			while (true) {
			
			y = input.nextInt(); 

			if (y < 0) break; 
			if (y > maxValue) maxValue = y; 
			if (y < minValue) minValue = y; 
		
			}
			System.out.println(maxValue + " " + minValue); 
		}
			
		else System.out.println("Invalid Input"); 
	
	}

}



	

