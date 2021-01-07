import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class newex {

	public static void main (String[] args) {

		Scanner s = new Scanner(System.in); 

		int n;

		while (true) {
			System.out.println("enter #"); 
			n = s.nextInt();

			if ( n > 10 || n < 1)
				continue; 

			System.out.println(n + " is between 1 and 10"); 
			break; 

		}
	}

}



